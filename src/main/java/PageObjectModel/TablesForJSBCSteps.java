package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TablesForJSBCSteps {

    public TablesForJSBCSteps(){
        /*
            What is the point of this line?
                This line is taking the driver from Driver.getDriver()
                And share this driver with the @FindBy, @FindAll in this page
         */
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Get the name column elements from the page

    @FindAll({
            @FindBy(xpath = "//table//tr//td[1]")
    })
    private List<WebElement> firstItemsInTable;

    @FindAll({
            @FindBy(xpath = "//table//tr//td[2]")
    })
    private List<WebElement> secondItemsInTable;



    public ArrayList<String> getTheList(int whichColumn){

        ArrayList<String> result = new ArrayList<>();

        if(whichColumn == 1){
            result = firstItemsInTable;
        }else if(whichColumn ==2){
            result = secondItemsInTable;
        }

    }



}
