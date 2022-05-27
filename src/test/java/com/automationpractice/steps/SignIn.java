package com.automationpractice.steps;

import com.automationpractice.pages.AuthPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.MyAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignIn {
    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {
       new HomePage().clickonSigninButton();
    }

    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() {
        new AuthPage().setEmailAddressForAlreadtRegisterd("tenalirama@gmail.com");
        new AuthPage().setPasswordForAlreadyRegisterd("abc123");
        new AuthPage().setSignInClickForAlreayRegistered();
    }

    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {

        new MyAccountPage().clickOnMyAddress();
        String[]expected={"12,main street","Leeds, Ohio 32512","United States"};
        for(int i=3;i<expected.length;i++){
            System.out.println(new MyAccountPage().getAddressText()[i]);
            Assert.assertEquals("",expected[i],new MyAccountPage().getAddressText());
        }




    }
}
