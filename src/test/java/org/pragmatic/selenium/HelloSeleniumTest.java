package org.pragmatic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloSeleniumTest {

    @Test
    public void testHelloSelenium(){

        //Create a browser instance
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        //Navigate to the login page
        webDriver.get("https://www.saucedemo.com/");

        //Type Username
        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");


        //Type Password
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");

        //Click login
        webDriver.findElement(By.id("login-button")).click();


        //Asset that "Product" is in the title
        Assert.assertEquals(webDriver.findElement(By.cssSelector("[data-test='title']")).getText(),"Products");

        //Close the browser
        webDriver.quit();
    }

}
