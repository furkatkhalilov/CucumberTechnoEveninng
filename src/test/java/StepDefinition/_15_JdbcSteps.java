package StepDefinition;

import cucumber.api.java.en.Then;

import java.sql.*;
import java.util.ArrayList;

public class _15_JdbcSteps {

    private Connection connection; // With a connection I am able to connect to my Database need to provide URL , username , password
    private Statement statement;

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

        ResultSet rs = statement.executeQuery(query);

        ArrayList<String> result = new ArrayList<>();

        while (rs.next()){

            String data = rs.getString(whichColumn);
            result.add(data);

        }

        return result;
    }

    @Then("^Send the query to database \"([^\"]*)\" get the column (\\d+)$")
    public void send_the_query_to_database_get_the_column(String query, int columnLocation) throws Throwable {

        ArrayList<String> a =getTheColumn(query,columnLocation);

        System.out.println(a);


    }


}
