package com.automationpractice.steps;


import com.automationpractice.pages.AuthPage;
import com.automationpractice.pages.ContectPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Contact {
    @And("^I am on the contact page$")
    public void iAmOnTheContactPage() {
        new HomePage().clickonSigninButton();
        new AuthPage().setEmailAddressForAlreadtRegisterd("tenalirama@gmail.com");
        new AuthPage().setPasswordForAlreadyRegisterd("abc123");
        new AuthPage().setSignInClickForAlreayRegistered();
        new HomePage().clickonContectUs();
    }

    @Then("^I send refund request to customer care for previous order$")
    public void iSendRefundRequestToCustomerCareForPreviousOrder() {
    new ContectPage().setsubjectHeading("Customer service");
    new ContectPage().sendMessagetoCustomerService("I need refund");
    new ContectPage().clickOnSend();
    }
}
