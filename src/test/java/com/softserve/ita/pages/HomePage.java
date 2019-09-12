package com.softserve.ita.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement editBoxSearch = driver.findElement(By.id("txtGlobalSearch"));;

    public HomePage verifyPageOpened(){
        Assert.assertEquals(getTitle(), "Сообщество программистов | DOU", "DOU was not opened");
        return this;
    }

    public ResultsPage typeSearchRequest(String value) {
        editBoxSearch.sendKeys(value);
        return new ResultsPage(driver);
    }


}
