package com.demo.guru99.comtestnewtoursindex.php.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class CreateNewAccountPage extends PageObject {

    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By phone = By.name("phone");
    By email = By.name("email");
    By address1 = By.name("address1");
    By city = By.name("city");
    By state = By.name("state");
    By postalCode = By.name("postalCode");
    By password = By.name("password");
    By confirmPassword = By.name("confirmPassword");
    By buttonSubmit = By.name("submit");

    public void setFirstName(String formUserDate) {getDriver().findElement(firstName).sendKeys(formUserDate);}
    public void setLastName(String formLastNameDate) {
        getDriver().findElement(lastName).sendKeys(formLastNameDate);
    }
    public void setPhone(String formPhoneDate) {
        getDriver().findElement(phone).sendKeys(formPhoneDate);
    }
    public void setEmail(String forEmailDate) {
        getDriver().findElement(email).sendKeys(forEmailDate);
    }
    public void setAddress1(String forAddressDate) {getDriver().findElement(address1).sendKeys(forAddressDate);}
    public void setCity(String forCityDate) {
        getDriver().findElement(city).sendKeys(forCityDate);
    }
    public void setState(String formStateDate) {
        getDriver().findElement(state).sendKeys(formStateDate);
    }
    public void setPostalCode(String formPostalCodeDate) {getDriver().findElement(postalCode).sendKeys(formPostalCodeDate);}
    public void setPassword(String formPasswordDate) {
        getDriver().findElement(password).sendKeys(formPasswordDate);
    }
    public void setConfirmPassword(String formConfirmPasswordDate) {getDriver().findElement(confirmPassword).sendKeys(formConfirmPasswordDate);
    }

    public void buttonSubmit() {
        getDriver().findElement(buttonSubmit).click();
    }

}

