package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends Utility {
    private static final Logger log= LogManager.getLogger(AuthPage.class);

    public AuthPage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement createemail;
    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement radiobuttonGender;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailId;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement dateforBOD;
    @CacheLookup
    @FindBy(id = "months")
    WebElement monthofBOD;
    @CacheLookup
    @FindBy(id="years")
    WebElement yearofBDD;
    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newslettersignup;
    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement specialofferclick;
    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement addressFirstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement addressLastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement companyName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressLine1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address2']")
    WebElement addressLine2;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityName;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipcode;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryName;
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='other']")
    WebElement additionalInformation;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhone;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhone;
    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement futurerefranceaddress;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerBtnClick;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement varifyMyaccountText;
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailaddressforalreadtregisterd;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordforalreadtregisterd;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signinforalreadtregisterd;

    public void setEmailAddressForAlreadtRegisterd(String email) {
        sendTextToElement(emailaddressforalreadtregisterd, email);
        log.info("Enter email "+email+ " to email address for already registerd field "+emailaddressforalreadtregisterd.toString() + "<br>");
    }
    public void setPasswordForAlreadyRegisterd(String password) {
        sendTextToElement(passwordforalreadtregisterd, password);
        log.info("Enter password "+password+ " to password field "+passwordforalreadtregisterd.toString() + "<br>");
    }
    public void setSignInClickForAlreayRegistered() {
        clickOnElement(signinforalreadtregisterd);
        log.info("Clicking on signin for alreadt registerd  click"+ signinforalreadtregisterd.toString()+ "<br>");
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement accountemail;

    public void createUserByNewEmail(String email){
        sendTextToElement(createemail,email);
    }

    public void setacountemailforregistration(String email) {
        sendTextToElement(accountemail, email);
        log.info("Enter email "+email+ " to email field "+accountemail.toString() + "<br>");
    }


    public void clickOnCreateAccoutnButton() {
        clickOnElement(createAnAccountButton);
        log.info("Clicking on CreateAccount"+ createAnAccountButton.toString()+ "<br>");
    }
    public String myaccountTextvarify(){
        log.info("getting varify Myaccount Text  from "+varifyMyaccountText.toString()+"<br>");
        return getTextFromElement(varifyMyaccountText);
    }
    public void setAddressFirstName(String firstName) {
        sendTextToElement(addressFirstName, firstName);
        log.info("Enter first Name "+firstName+ " to email field "+addressFirstName.toString() + "<br>");
    }

    public void setAddressLastNameName(String lastName) {
        sendTextToElement(addressLastName, lastName);
        log.info("Enter last Name "+lastName+ " to email field "+addressLastName.toString() + "<br>");
    }

    public void setNewslettersignup() {
        clickOnElement(newslettersignup);
        log.info("Clicking on newsletter signup"+ newslettersignup.toString()+ "<br>");
    }

    public void setAddressLine1(String address1) {
        sendTextToElement(addressLine1, address1);
        log.info("Enter address "+address1+ " to email field "+addressLine1.toString() + "<br>");
    }

    public void setAddressLine2(String address2) {
        sendTextToElement(addressLine2, address2);
        log.info("Enter address "+address2+ " to email field "+addressLine2.toString() + "<br>");
    }

    public void setCityName(String city) {
        sendTextToElement(cityName, city);
        log.info("Enter city "+city+ " to email field "+cityName.toString() + "<br>");
    }

    public void setStateNameName(String state) {
        selectByVisibleTextFromDropDown(stateName, state);
        log.info("Selecting state "+state+" from dropdown "+stateName.toString() + "<br>");
    }

    public void setZipcode(String code) {
        sendTextToElement(zipcode, code);
        log.info("Enter code "+code+ " to email field "+zipcode.toString() + "<br>");
    }

    public void setCountryName(String country) {
        selectByVisibleTextFromDropDown(countryName, country);
        log.info("Selecting country "+country+" from dropdown "+countryName.toString() + "<br>");
    }

    public void setAdditionalInformation(String text) {
        sendTextToElement(additionalInformation, text);
        log.info("Enter additional Information "+text+ " to email field "+additionalInformation.toString() + "<br>");
    }

    public void setHomePhone(String Phone) {
        sendTextToElement(homePhone, Phone);
        log.info("Enter Phone "+Phone+ " to email field "+homePhone.toString() + "<br>");
    }

    public void setMobilePhone(String mPhone) {
        sendTextToElement(mobilePhone, mPhone);
        log.info("Enter mP hone"+mPhone+ " to email field "+mobilePhone.toString() + "<br>");
    }

    public void setassignaddress(String assignaddress) {
        sendTextToElement(futurerefranceaddress, assignaddress);
        log.info("Enter assign address "+assignaddress+ " to email field "+futurerefranceaddress.toString() + "<br>");
    }

    public void clickRegisterButton() {
        clickOnElement(registerBtnClick);
        log.info("Clicking on register Btn Click "+ registerBtnClick.toString()+ "<br>");
    }


    public void setspecialOfferClick() {
        clickOnElement(specialofferclick);
        log.info("Clicking on special offer click"+ specialofferclick.toString()+ "<br>");
    }

    public void setBirthdate(String date) {
        selectByValueFromDropDown(dateforBOD, date);
        log.info("selecting day"+date+dateforBOD.toString()+"<br>");
    }

    public void setMonth(String month) {
        selectByValueFromDropDown(monthofBOD, month);
        log.info("selecting month"+month+monthofBOD.toString()+"<br>");
    }

    public void setYear(String year) {
        selectByValueFromDropDown(yearofBDD, year);
        log.info("Selecting year "+year+" from dropdown "+yearofBDD.toString() + "<br>");
    }

    public void setPassword(String password1) {
        sendTextToElement(password, password1);
        log.info("Enter password "+password1+ " to email field "+password.toString() + "<br>");
    }


    public void setFirstName(String fname) {
        sendTextToElement(firstName, fname);
        log.info("Enter first name "+fname+ " to first name field "+firstName.toString() + "<br>");
    }

    public void setLastName(String lname) {
        sendTextToElement(lastName, lname);
        log.info("Enter last name "+lname+ " to last name field "+lastName.toString() + "<br>");
    }

    public void setEmailId(String email) {
        sendTextToElement(emailId, email);
        log.info("Enter email "+email+ " to email field "+emailId.toString() + "<br>");
    }


    public void radioBtnForGender() {
        clickOnElement(radiobuttonGender);
    }
    public void setCompanyName(String text){
        sendTextToElement(companyName,text);
        log.info("Enter text "+text+ " to email field "+companyName.toString() + "<br>");
    }














}
