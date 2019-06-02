package test.java.artifactory.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
 
public class seleniumTestCase  {
	@Test
  public void JenkinsTest ()
	{
 
    // Create an instance of the driver
    WebDriver driver = new ChromeDriver();
 
    // Navigate to a web page
    driver.navigate().to("");
    driver.manage.timeouts().implcitlyWait(5, TimeUnit.SECONDS);
    // Perform actions on HTML elements, entering text and submitting the form
    WebElement text1 = driver.findElement(By.name("username"));
    WebElement text2 = driver.findElement(By.name("password"));
 
    // Run a test
    String message = text1.getText();
    String successMsg = "Welcome to foo. You logged in successfully.";
    Assert.assertEquals (message, successMsg);
 
    // Conclude a test
    driver.quit();
 
  }
}