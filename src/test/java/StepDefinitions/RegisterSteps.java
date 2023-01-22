package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class RegisterSteps {

    DialogContent dc=new DialogContent();
    @Given("Navigate to Clever WebSite")
    public void navigateToCleverWebSite() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        GWD.getDriver().manage().window().maximize();
    }





    @And("Fill the register form")
    public void fillTheRegisterForm(DataTable elemanlar) {
        List<List<String>> listElemanlar=elemanlar.asLists(String.class);
        for (int i = 0; i <listElemanlar.size() ; i++) {
            dc.findAndSend(listElemanlar.get(i).get(0),listElemanlar.get(i).get(1));

        }

    }

    @When("Click elements on dialogContent")
    public void clickElementsOnDialogContent(DataTable elemanlar) {

        List<String> listElemanlar= elemanlar.asList(String.class);

        for(String strButtonName : listElemanlar) {
            dc.findAndClick(strButtonName);
        }


    }


    @Then("Alert message should be displayed")
    public void alertMessageShouldBeDisplayed(DataTable elemanlar) {
        List<String> listElements = elemanlar.asList(String.class);

        for (String strText : listElements) {
            dc.findAndContainsText("createdMessage", strText);
        }
    }


}
