package API;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SQLHandler {
    private static final String dbUsername = "root";
    private static final String dbPassword = "abc123";
    private static final String dbName = "db_poea";
    private static final String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
    private static ArrayList<Map> results = new ArrayList<>();
    String query;

    public SQLHandler() {
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
    private Connection createConnection() {
        //Create a connection to the database
        Connection connection;
        try {
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        return connection;
    }

    //Create a template for query creation
    public SQLHandler createQuery(String query) {
        //Identify if the query is valid
        String[] sqlKeywords = {"SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "ALTER", "DROP", "TRUNCATE"};
        //Test if the query is valid
        boolean isValid = false;
        for (String keyword : sqlKeywords) {
            if (query.toUpperCase().contains(keyword)) {
                isValid = true;
                //Store the query in the statement
                this.query = query;
                break;
            }
        }
        //If not valid, throw an exception
        if (!isValid) {
            throw new IllegalStateException("Invalid SQL query!");
        }
        return this;
    }

    //Create multiple execution styles (Create, Read, Update, Delete)
    public void executeQuery() {
        Statement statement;
        ResultSet resultSet;
        try {
            //Identify what type of query is being executed - based on the first word of the query - if DML or DDL
            if (query.split(" ")[0].equalsIgnoreCase("SELECT")) {
                try (Connection connection = createConnection()) {
                    statement = connection.createStatement();
                    //Store the results of the query in a result set
                    resultSet = statement.executeQuery(query);
                    //After the query is executed, return the results in a map.
                    //If the query is a read query, return the results in a map.
                    if (resultSet != null) {
                        //Clean results before storing new ones
                        results.clear();
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
                        System.out.println("Query executed successfully! - No results to show.");
                    }
                }
            } else {
                try {
                    try (Connection connection = createConnection()) {
                        statement = connection.createStatement();
                        statement.executeUpdate(query);
                        System.out.println("Query executed successfully!");
                    }
                } catch (SQLException e) {
                    throw new IllegalStateException("Cannot execute the query!" + query, e);
                }
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot execute the query: " + query, e);
        }
    }

    //Function to get the results of the query
    public ArrayList<Map> getResults() {
        return results;
    }

    //Create a test connection function
    public boolean testConnection() {
        try (java.sql.Connection connection = createConnection()) {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //Test the SQLHandler class
    public static void main(String[] args) {
        SQLHandler sqlHandler = new SQLHandler();
        sqlHandler.createQuery("SELECT * FROM user").executeQuery();
        //Print the results of the query
        for (var result : sqlHandler.getResults()) {
            System.out.println(result);
        }
    }
}
