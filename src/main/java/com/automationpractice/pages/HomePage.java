package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signinclick;

    public void clickonSigninButton() {
        clickOnElement(signinclick);
        log.info("Clicking on sign in click"+ signinclick.toString()+ "<br>");
    }
    @CacheLookup
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[3]/a[1]")
    WebElement contactus;

    public void clickonContectUs() {
        clickOnElement(contactus);
        log.info("Clicking on contact us "+ contactus.toString()+ "<br>");
    }

}
