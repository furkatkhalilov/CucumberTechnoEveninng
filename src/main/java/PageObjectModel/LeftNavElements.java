package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavElements extends _01_ParentClass{

    /*
        Finish the Countries.feature
        Parent class
            Click function --> wait for element then click on the element
            SendKys function --> wait for element then send keys on the element

     */

     /*
        In the cucumber each element in the page object model should be private
            and each element should have a method to click on it or send keys.
     */

    public LeftNavElements(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement Setup1Button;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupButtonUnderInventory;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement ParametersButton;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement CountriesButton;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement Nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement Fees;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement Citizenships;

    @FindBy(xpath = "//span[text()='Inventory']")
    private WebElement Inventory;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement ItemCategory;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement EntranceExamsParent;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement EntranceExamsSetup;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement EntranceExamsChild;

    @FindBy(xpath = "//span[text()='Student']")
    private WebElement StudentParent;

    @FindBy(xpath = " //span[text()='Students']")
    private WebElement StudentsButton;

    @FindBy(xpath = " //span[text()='Release Notes']")
    private WebElement ReleaseNotesButton;

    @FindBy(xpath = " (//span[text()='Reports'])[3]")
    private WebElement reports;

    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement setupUnderTheReports;

    @FindBy(xpath = "//span[text()='Excel Template']")
    private WebElement excel_Template;


    /*
        We can create couple methods which is finding the element in the class

           And calling the method from the parent class.

     */

    WebElement myElement;

    public void findElementAndClickFunction(String elementName){

        switch (elementName){

            case "Setup1Button":
                myElement =Setup1Button;
                break;
            case "ParametersButton":
                myElement =ParametersButton;
                break;
            case "CountriesButton":
                myElement =CountriesButton;
                break;
            case "Nationalities":
                myElement =Nationalities;
                break;
            case "Fees":
                myElement =Fees;
                break;
            case "Citizenships":
                myElement =Citizenships;
                break;
            case "setupButtonUnderInventory":
                myElement =setupButtonUnderInventory;
                break;
            case "ItemCategory":
                myElement =ItemCategory;
                break;
            case "Inventory":
                myElement =Inventory;
                break;
            case "EntranceExamsChild":
                myElement =EntranceExamsChild;
                break;
            case "EntranceExamsSetup":
                myElement =EntranceExamsSetup;
                break;
            case "EntranceExamsParent":
                myElement =EntranceExamsParent;
                break;
            case "StudentParent":
                myElement =StudentParent;
                break;
            case "StudentsButton":
                myElement =StudentsButton;
                break;
            case "ReleaseNotesButton":
                myElement =ReleaseNotesButton;
                break;
            case "reports":
                myElement =reports;
                break;
            case "setupUnderTheReports":
                myElement =setupUnderTheReports;
                break;
            case "excel_Template":
                myElement =excel_Template;
                break;
        }

//    Call the method from the parent class.
        clickFunction(myElement);

    }




    /*
        One parent method --> click function , sendKeysfunction
     */

//      If you have 100 elements then you need a 100 methods. This is way one.
//    public void ClickOnSetup1Button(){
//        Setup1Button.click();
//    }

}
