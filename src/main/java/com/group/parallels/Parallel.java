package com.group.parallels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Parallel {

    WebDriver driver;

    @Test
    void loginButtonTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://fap.fpt.edu.vn");

        WebElement loginButton = driver.findElement(By.xpath(
                "//*[@id=\"ctl00_mainContent_divcontent\"]/div/div[1]/div/fieldset/div/a/h3/span/b"));
        Assert.assertTrue(loginButton.isDisplayed(), "Login button is not displayed on the page");
        Thread.sleep(5000);
    }

    @Test
    void homePageTittle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://fap.fpt.edu.vn");

        String title = driver.getTitle();
        Assert.assertEquals(title,"FPT University Academic Portal", "Tittle is not matched");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
