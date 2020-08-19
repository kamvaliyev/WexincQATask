package com.wexinc.step_definitions;

import com.wexinc.utilities.BrowserUtil;
import com.wexinc.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class SearchStepDefinitions {

   WebDriver driver = Driver.createDriver("chrome");

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.wexinc.com/");
        driver.manage().window().maximize();
        BrowserUtil.wait(3);
    }


    @And("user click search button")
    public void user_click_search_button()  {
        driver.findElement(By.xpath("//*[@id=\"mega-menu-item-439\"]/a/i")).click();
        BrowserUtil.wait(3);
    }


    @When("user enter {string}")
    public void user_enter(String string)  {
        driver.findElement(By.id("s")).sendKeys(string, Keys.ENTER);
        BrowserUtil.wait(3);
    }


    @Then("user should verify that title contains {string}")
    public void user_should_verify_that_title_contains(String string){
        BrowserUtil.wait(3);
        Assert.assertTrue(driver.getTitle().contains(string));
        BrowserUtil.wait(3);
        driver.quit();
    }

}
