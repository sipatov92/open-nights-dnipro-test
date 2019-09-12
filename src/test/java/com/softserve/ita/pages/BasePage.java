package com.softserve.ita.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void wait(int timeout){
        try {
            Thread.sleep(timeout);
        } catch (Exception e) {
        }
    }
}
