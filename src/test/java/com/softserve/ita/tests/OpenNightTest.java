package com.softserve.ita.tests;

import com.softserve.ita.pages.HomePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNightTest extends BaseTest {
    @Test
    public void openNightDniproTest(){
        getDriver().get("https://dou.ua");

        HomePage homePage = new HomePage(getDriver());

        homePage.verifyPageOpened()
                .typeSearchRequest("open night softserve dnipro" + Keys.ENTER)
                .verifyResultExists("Open Night IT Academy, 12 вересня | DOU");
    }
}

