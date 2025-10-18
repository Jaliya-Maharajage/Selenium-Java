package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.Config;
import support.DriverFactory;
import org.testng.Assert;

@SuppressWarnings("unused")
public class PickmeSteps {
  private WebDriver driver;

  @Given("I open Pickme")
  public void i_open_google() {
    driver = DriverFactory.getDriver();
    driver.get(Config.baseUrl());
  }

  @When("I Click Services")
  public void i_click_services() {
      driver.findElement(By.xpath("/html/body/div/header/div[1]/div/div/div[2]/div/ul/li[3]/a")).click();
  }

//  
//  @When("I search for {string}")
//  public void i_search_for(String text) {
//    WebElement box = driver.findElement(By.name("q"));
//    box.sendKeys(text + Keys.ENTER);
//  }
//
//  @Then("I should see results")
//  public void i_should_see_results() {
//    boolean anyResult = driver.findElements(By.cssSelector("a h3")).size() > 0;
//    Assert.assertTrue(anyResult, "Expected at least one search result");
//  }
}
