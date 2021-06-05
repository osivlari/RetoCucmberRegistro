package com.demo.guru99.comtestnewtoursindex.php.automation.comtestnewtoursindexphp.test.stepdefinitions;

import com.demo.guru99.comtestnewtoursindex.php.automation.models.Data;
import com.demo.guru99.comtestnewtoursindex.php.automation.steps.CreateNewAccountStep;
import com.demo.guru99.comtestnewtoursindex.php.automation.steps.HomeStep;
import com.demo.guru99.comtestnewtoursindex.php.automation.steps.HomeLoginUserStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterStepDefinition {

    @Steps
    HomeStep homeStep;

    @Steps
    CreateNewAccountStep createNewAccountStep;

    @Steps
    HomeLoginUserStep homeLoginUserStep;


    @Given("^que el usuario abre el navegador en la pagina WEB Guru99 y le da click en nuevo reigistro$")
    public void selectNewRegister() throws InterruptedException {
        homeStep.openBrowser();
        homeStep.selectCreateNewAccount();
        Thread.sleep(2000);
    }

    @When("^Este ingresa los datos en las casillas correspondientes de la informacion y le de enviar$")
    public void sendDatesUser(List<Data> dataList) throws InterruptedException {
        createNewAccountStep.registerUser(dataList.get(0));
        Thread.sleep(2000);
    }


    @Then("^se le dara click en la opcion de login para ingresar con nueva cuenta$")
    public void selectLoginUser(){
        homeLoginUserStep.selectLoginUserStep();
    }
}
