package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void before()
    {
        System.out.println("Senaryo başladı");
    }


    @After
    public void after(Scenario scenario)
    {


        System.out.println("Senaryo bitti");



        if(scenario.isFailed()){

            final byte[] screenshot = ((TakesScreenshot) GWD.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot name");


        }

        GWD.quitDriver();
    }
}
