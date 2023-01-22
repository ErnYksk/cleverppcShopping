package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AddToCartSteps {

    DialogContent dc=new DialogContent();
    Actions actions=new Actions(GWD.getDriver());
    @When("Come to Women section and select Summer Dresses")
    public void comeToWomenSectionAndSelectSummerDresses() {
        WebElement women= GWD.getDriver().findElement(By.xpath("//a[@title='Women']"));
        WebElement summer= GWD.getDriver().findElement(By.xpath("(//a[@title='Summer Dresses'])[1]"));


        actions.moveToElement(women).build().perform();
        actions.moveToElement(summer).click().build().perform();

    }

    @And("Choose a product randomly")
    public void chooseAProductRandomly() {
        int random=(int) (Math.random()*3);
        List<WebElement> products=GWD.getDriver().findElements(By.xpath("//ul[@id='product_list']//li"));
        List<WebElement> randomAddToCart=GWD.getDriver().findElements(By.xpath("//span[text()='Add to cart']"));


        actions.moveToElement(products.get(random)).build().perform();
        actions.moveToElement(randomAddToCart.get(random)).click().build().perform();







    }

    @Then("Product should be added to cart")
    public void productShouldBeAddedToCart(DataTable elemanlar) {
        List<String> listElements = elemanlar.asList(String.class);

        for (String strText : listElements) {
            dc.findAndContainsText("added", strText);
        }
    }
}
