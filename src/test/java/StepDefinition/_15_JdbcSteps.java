package StepDefinition;

import PageObjectModel.TablesForJSBCSteps;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.sql.*;
import java.util.ArrayList;

public class _15_JdbcSteps {

    private Connection connection; // With a connection I am able to connect to my Database need to provide URL , username , password
    private Statement statement;
    TablesForJSBCSteps tablesForJSBCSteps = new TablesForJSBCSteps();

// Connect to database
    public void createTheDataBaseConnection() throws SQLException {

        String URL ="jdbc:mysql://test.medis.mersys.io:33306/ts_AliSchema";
        String username = "technostudy";
        String password = "zhTPis0l9#$&";
        connection = DriverManager.getConnection(URL,username,password);
        statement = connection.createStatement();

    }

//    Get the column from the database table
    public ArrayList<String> getTheColumn(String query , int whichColumn) throws SQLException {

        ResultSet rs = statement.executeQuery(query); // Send the query to database and store it in the ResultSet

        ArrayList<String> result = new ArrayList<>(); // All the data from the database will be stored in this ArrayList

        while (rs.next()){// while there is a next row then navigate to next row

            String data = rs.getString(whichColumn);// get the data one by one and store it in the String data
            result.add(data); // add each data to arraylist

        }

        return result;
    }

    @Then("^Send the query to database \"([^\"]*)\" get the column (\\d+)$")
    public void send_the_query_to_database_get_the_column(String query, int columnLocation) throws Throwable {

        createTheDataBaseConnection();

        ArrayList<String> FromTheDataBase = getTheColumn(query,columnLocation);

        System.out.println(FromTheDataBase);

        ArrayList<String> FromWebSite = tablesForJSBCSteps.getTheList(columnLocation);

        System.out.println(FromWebSite);

//      Compare two ArrayLists by each element
        for(int i =0 ; i<FromTheDataBase.size() ; i++){

            Assert.assertEquals(FromTheDataBase.get(i),FromWebSite.get(i));

        }

    }


}
