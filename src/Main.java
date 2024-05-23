/**
 *
 * @author Troy
 */

import API.SQLHandler;
import Components.Login;
import Utilities.*;
import Layouts.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Attempt to connect to the database
        SQLHandler a = new SQLHandler();
        //If the connection is successful, show the login screen
        if (a.testConnection()) {
            EventQueue.invokeLater(() -> {
                LoginSignUp.main(new String[0]);
            });
        } else {
            //If the connection is unsuccessful, show an error dialog
            JOptionPane.showMessageDialog(null, "Can't connect to the server!", "Launch Error", JOptionPane.ERROR_MESSAGE);
            //Exit the program
            System.exit(0);
        }


    }
}
