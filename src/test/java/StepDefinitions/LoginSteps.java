package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {

    DialogContent dc = new DialogContent();

    @When("Enter invalid Username and Password anc click login button")
    public void enterInvalidUsernameAndPasswordAncClickLoginButton(DataTable elemanlar) {
        List<List<String>> listElemanlar = elemanlar.asLists(String.class);
        for (int i = 0; i < listElemanlar.size(); i++) {
            dc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1));

        }
    }


    @When("Enter valid Username and Password anc click login button")
    public void enterValidUsernameAndPasswordAncClickLoginButton(DataTable elemanlar) {
        List<List<String>> listElemanlar = elemanlar.asLists(String.class);
        for (int i = 0; i < listElemanlar.size(); i++) {
            dc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1));

        }

    }

    @Then("User should be able to login successfully")
    public void userShouldBeAbleToLoginSuccessfully(DataTable elemanlar) {
        List<String> listElements = elemanlar.asList(String.class);

        for (String strText : listElements) {
            dc.findAndContainsText("successLogin", strText);
        }
    }



    @Then("User should not be able to login successfully")
    public void userShouldNotBeAbleToLoginSuccessfully(DataTable elemanlar) {
        List<String> listElements = elemanlar.asList(String.class);

        for (String strText : listElements) {
            dc.findAndContainsText("successFailed", strText);
        }
    }
}

