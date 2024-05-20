package com.group.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertion {

    WebDriver driver;

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://fap.fpt.edu.vn");
    }

    @Test(priority = 1)
    void loginButtonTest() {
        WebElement loginButton = driver.findElement(By.xpath(
                "//*[@id=\"ctl00_mainContent_divcontent\"]/div/div[1]/div/fieldset/div/a/h3/span/b"));
        Assert.assertTrue(loginButton.isDisplayed(), "Login button is not displayed on the page");
    }

    @Test(priority = 2)
    void homePageTittle() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"FPT University Academic Portal", "Tittle is not matched");
        //Assert.assertEquals(title,"FPT University", "Tittle is not matched");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
