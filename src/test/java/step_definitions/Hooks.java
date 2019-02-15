package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import utilities.BrowserUtils;
import utilities.Driver;

public class Hooks {

    @Before
    public void before(Scenario scenario){
        System.out.println("------------------------------");
        System.out.println("STARTING: " + scenario.getName());
        System.out.println("------------------------------");
    }


    @After
    public void after(Scenario scenario){
        String testName = scenario.getName();

        System.out.println("------------------------------");
        System.out.println(scenario.getName() + " - Status: " + testName);
        System.out.println("------------------------------");


        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
                scenario.write(testName);
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();}
        }

        BrowserUtils.wait(3);
        Driver.closeDriver();

    }


}
