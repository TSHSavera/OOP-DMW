/*
Utility class to parse the results of an SQL query
To start, create a class that extends this class and implement the sqlQuery() method
The sqlQuery() method should return an ArrayList of Maps - which is also implemented in the SQLHandler class
The parseResults() method is used to parse the results of the query
The getValueByKey() method is used to get the value of a key from the parsed results
Useful if you want to get the results of a query in a more readable format
or if you want to get the results from a query that returns multiple rows

Example usage:
public class TestSQLResultParser extends SQLResultParser {
    @Override
    public ArrayList<Map> sqlQuery() {
        //Create a new SQLHandler object
        SQLHandler sqlHandler = new SQLHandler();
        //Create a new query
        String query = "SELECT * FROM test_table";
        //Execute the query
        sqlHandler.executeQuery(query);
        //Return the results
        return sqlHandler.getResults();
    }

    public static void main(String[] args) {
        //Create a new TestSQLResultParser object
        TestSQLResultParser testSQLResultParser = new TestSQLResultParser();
        //Parse the results of the query
        testSQLResultParser.parseResults(testSQLResultParser.sqlQuery());
        //Get the value of a key from the parsed results
        System.out.println(testSQLResultParser.getValueByKey("test_column"));
    }
 */
package Utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class SQLResultParser {
    //Store the results of the query
    private ArrayList<Map> results = new ArrayList<>();
    private Map<String, String> result = new HashMap<>();

    public abstract ArrayList<Map> sqlQuery();
    //On instantiation, parse the results of the query
    public SQLResultParser() {
        results = sqlQuery();
    }

    public SQLResultParser parseResults() {
        //Parse the results of the query - make it accessible by doing parseResults().get("Key")
        result = results.get(0);
        return this;
    }

    public SQLResultParser parseResults(int index) {
        //Parse the results of the query - make it accessible by doing parseResults().get("Key")
        result = results.get(index);
        return this;
    }

    public int getResultsSize() {
        return results.size();
    }

    public Object getValueByKey(String key) {
        return this.result.get(key);
    }
}
