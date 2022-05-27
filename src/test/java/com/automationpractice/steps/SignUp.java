package com.automationpractice.steps;

import com.automationpractice.pages.AuthPage;
import com.automationpractice.pages.HomePage;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignUp {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @Then("^I navigate to SignUp page$")
    public void iNavigateToSignUpPage() {
        new HomePage().clickonSigninButton();
    }

    @And("^create an account with random username$")
    public void createAnAccountWithRandomUsername() {
        new AuthPage().createUserByNewEmail("jagdambe@gmail.com");//we can also do get string method from Utilityclass;
        //Utility.getRandomString(.gmail.com) It only works for registration
        new AuthPage().clickOnCreateAccoutnButton();
        new AuthPage().radioBtnForGender();
        new AuthPage().setFirstName("Jag");
       new AuthPage().setLastName("Damba");
       new AuthPage().setPassword("jag123456");
       new AuthPage().setBirthdate("12");
       new AuthPage().setMonth("12");
       new AuthPage().setYear("1995");
       new AuthPage().setAddressFirstName("Jag");
       new AuthPage().setAddressLastNameName("Dambe");
       new AuthPage().setCompanyName("Everystep Ltd");
       new AuthPage().setAddressLine1("16,Lyon Road");
       new AuthPage().setAddressLine2("Harrow");
       new AuthPage().setCityName("London");
       new AuthPage().setStateNameName("Arizona");
       new AuthPage().setZipcode("ha1 4dp");
       new AuthPage().setCountryName("United States");
       new AuthPage().setAdditionalInformation("Hello");
       new AuthPage().setHomePhone("325412578");
       new AuthPage().setMobilePhone("07458256585");
       new AuthPage().setassignaddress("My address");
       new AuthPage().clickRegisterButton();

    }
}
