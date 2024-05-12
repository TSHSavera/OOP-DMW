package API;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SQLHandler {
    private static final String dbUsername = "root";
    private static final String dbPassword = "";
    private static final String dbName = "gisakay";
    private static final String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
    private static ArrayList<Map> results = new ArrayList<>();

    SQLHandler() {
        loadDriver();
    }

    //Load the driver
    private void loadDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }
    }

    //Create a default sql connection
    private java.sql.Connection createConnection() {
        //Create a connection to the database
        java.sql.Connection connection;
        try {
            connection = java.sql.DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        return connection;
    }

    //Create a template for query creation
    public java.sql.Statement createQuery(String query) {
        java.sql.Statement statement;
        try (Connection connection = createConnection()) {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot create the statement!", e);
        }
        return statement;
    }

    //Create multiple execution styles (Create, Read, Update, Delete)
    public void executeQuery(String query) {
        java.sql.Statement statement;
        ResultSet resultSet;
        try {
            try (Connection connection = createConnection()) {
                statement = connection.createStatement();
                //Store the results of the query in a result set
                resultSet = statement.executeQuery(query);
                //After the query is executed, return the results in a map.
                //If the query is a read query, return the results in a map.
                //If the query is a create, update, or delete query, return a map with a success message.
                if (resultSet != null) {
                    try {
                        while (resultSet.next()) {
                            //Save the results
                            Map<String, String> row = new HashMap<>();
                            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                                row.put(resultSet.getMetaData().getColumnName(i), resultSet.getString(i));
                            }
                            results.add(row);
                        }
                    } catch (SQLException e) {
                        throw new IllegalStateException("Cannot read the results!", e);
                    }
                } else {
                    System.out.println("Query executed successfully!");
                }
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot execute the query!", e);
        }
    }

    //Function to get the results of the query
    public ArrayList<Map> getResults() {
        return results;
    }

    //Test the SQLHandler class
    public static void main(String[] args) {
        SQLHandler sqlHandler = new SQLHandler();
        sqlHandler.executeQuery("SELECT * FROM studentdata");
        //Print the results of the query
        for (Map result : sqlHandler.getResults()) {
            System.out.println(result);
        }
    }
}
