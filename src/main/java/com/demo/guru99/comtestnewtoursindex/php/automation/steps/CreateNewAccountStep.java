package com.demo.guru99.comtestnewtoursindex.php.automation.steps;

import com.demo.guru99.comtestnewtoursindex.php.automation.models.Data;
import com.demo.guru99.comtestnewtoursindex.php.automation.pageobjects.CreateNewAccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CreateNewAccountStep {
    CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();

    @Step
    public void registerUser(Data data) {
        createNewAccountPage.setFirstName(data.getUserName());
        createNewAccountPage.setLastName(data.getLastName());
        createNewAccountPage.setPhone(data.getPhone());
        createNewAccountPage.setEmail(data.getEmail());
        createNewAccountPage.setAddress1(data.getAddress1());
        createNewAccountPage.setCity(data.getCity());
        createNewAccountPage.setState(data.getState());
        createNewAccountPage.setPostalCode(data.getPostalCode());
        createNewAccountPage.setPassword(data.getPassword());
        createNewAccountPage.setConfirmPassword(data.getConfirmPassword());
        createNewAccountPage.buttonSubmit();
    }

}
