package API;

import Utilities.SQLResultParser;

import java.util.ArrayList;
import java.util.Map;

public class Auth {
    //Store user id for future references
    public static int userId;
    //Store user data for future references
    public static Map userData;

    //Create a login function
    public static boolean login(String email, String password) {
        //Create a query
        SQLHandler a = new SQLHandler();
        a.createQuery("SELECT * FROM user WHERE EmailAddress = '" + email + "' AND Password = '" + password + "'").executeQuery();

        //Check if the query has results
        if (!a.getResults().isEmpty()) {
            //Store the user id
            SQLResultParser b = new SQLResultParser() {
                @Override
                public ArrayList<Map> sqlQuery() {
                    return a.getResults();
                }
            };
            //Store the user id from previous query
            userId = Integer.parseInt(b.parseResults().getValueByKey("UserID").toString());
            saveUserData();
            return true;
        }

        return false;
    }

    public static boolean loginAdmin (String un, String pw) {
        //Create a query
        SQLHandler a = new SQLHandler();
        a.createQuery("SELECT * FROM admin WHERE AdminUN = '" + un + "' AND AdminPW = '" + pw + "'").executeQuery();

        //Check if the query has results
        if (!a.getResults().isEmpty()) {
            return true;
        }

        return false;
    }

    //Save user data
    public static void saveUserData() {
        //Create a query
        SQLHandler a = new SQLHandler();
        a.createQuery("SELECT * FROM user WHERE UserID = " + userId).executeQuery();

        userData = a.getResults().getFirst();
    }

    //Logout function
    public static void logout() {
        userId = 0;
        userData = null;
    }
}
