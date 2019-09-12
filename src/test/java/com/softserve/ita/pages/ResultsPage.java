package com.softserve.ita.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class ResultsPage extends BasePage {

    List<WebElement> results = driver.findElements(By.xpath("//div[@class='gs-title']"));

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public ResultsPage verifyResultExists(String expectedResult) {
        wait(3000);
        Assert.assertTrue(results.stream().anyMatch(el -> el.getText().equals(expectedResult)), "Result " + expectedResult + " not found");
        return this;
    }


}
