package com.demo.guru99.comtestnewtoursindex.php.automation.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomeLoginUserPage extends PageObject {

    public By buttonUserLogin = By.xpath("//a[contains(text(),'sign-in')]");

    @Step
    public  void buttonLogin() {
        getDriver().findElement(buttonUserLogin).click();

    }
}
