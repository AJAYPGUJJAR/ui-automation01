package com.apsg.steps;

import com.apsg.utils.AllureReportGenerator;
import com.apsg.utils.WebDriverSelector;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class StepDefs {

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverSelector selectWebDriver = new WebDriverSelector();
        driver = selectWebDriver.getWebDriver();
    }

    @Given("I open the url {string}")
    public void i_open_the_url(String url) {
        driver.navigate().to(url);
    }

    @After
    public void tearDown() {
        driver.quit();
        AllureReportGenerator allureReportGenerator = new AllureReportGenerator();
        allureReportGenerator.generateAllureReport();
    }

}
