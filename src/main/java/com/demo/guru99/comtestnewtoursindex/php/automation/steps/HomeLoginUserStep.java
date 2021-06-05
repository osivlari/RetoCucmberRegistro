package com.demo.guru99.comtestnewtoursindex.php.automation.steps;

import com.demo.guru99.comtestnewtoursindex.php.automation.pageobjects.HomeLoginUserPage;
import net.thucydides.core.annotations.Step;

public class HomeLoginUserStep {

    HomeLoginUserPage homeLoginUserPage = new HomeLoginUserPage();

    @Step
    public void selectLoginUserStep() {
        homeLoginUserPage.buttonLogin();
    }
}
