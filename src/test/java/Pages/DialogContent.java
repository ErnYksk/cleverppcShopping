package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    private WebElement signInButton;

    @FindBy(xpath = "(//button[@type='submit']//span)[3]")
    private WebElement logIn;

    @FindBy(id = "email_create")
    private WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    private WebElement submitCreate;

    @FindBy(id = "id_gender1")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement firstName;

    @FindBy(id = "customer_lastname")
    private WebElement lastName;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement days;

    @FindBy(id = "months")
    private WebElement months;

    @FindBy(id = "years")
    private WebElement years;

    @FindBy(id = "uniform-newsletter")
    private WebElement newsletter;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement receiveOffers;

    @FindBy(id = "submitAccount")
    private WebElement submitAccount;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement createdMessage;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(className = "info-account")
    private WebElement successLogin;

    @FindBy(xpath = "//*[text()='There is 1 error']")
    private WebElement successFailed;

 @FindBy(xpath = "(//span[@class='title'])[1]")
    private WebElement added;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "emailCreate":
                myElement = emailCreate;
                break;
            case "firstName":
                myElement = firstName;
                break;
            case "lastName":
                myElement = lastName;
                break;
            case "password":
                myElement = password;
                break;
            case "email":
                myElement = email;
                break;
        }

        sendKeysFunction(myElement, value);
    }


    public void findAndClick(String strElement) {
        switch (strElement) {
            case "signInButton":
                myElement = signInButton;
                break;
            case "submitCreate":
                myElement = submitCreate;
                break;
            case "gender":
                myElement = gender;
                break;

            case "newsletter":
                myElement = newsletter;
                break;

            case "receiveOffers":
                myElement = receiveOffers;
                break;

            case "submitAccount":
                myElement = submitAccount;
                break;

            case "logIn":
                myElement = logIn;
                break;




        }


        clickFunction(myElement);


    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "createdMessage":
                myElement = createdMessage;
                break;
            case "successLogin":
                myElement = successLogin;
                break;
            case "successFailed":
                myElement = successFailed;
                break;
                case "added":
                myElement = added;
                break;
        }


        verifyContainsTextFunction(myElement, text);
    }


    public void dropDownMenus(String strElement, String value) {
        switch (strElement) {
            case "days":
                myElement = days;
                break;
            case "months":
                myElement = months;
                break;
            case "years":
                myElement = years;
                break;


        }
        dropDownSelect(myElement, value);
    }


}
