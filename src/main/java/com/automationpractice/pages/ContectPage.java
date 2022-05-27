package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContectPage extends Utility {
    private static final Logger log= LogManager.getLogger(ContectPage.class);

    public ContectPage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_contact']")
    WebElement subjectheading;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]")
    WebElement sendclick;
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement messageText;






    public void setsubjectHeading(String Customerservice) {
       selectByVisibleTextFromDropDown(subjectheading,Customerservice);
        log.info("Enter subject heading "+Customerservice+ " to email field "+subjectheading.toString() + "<br>");
    }
    public void clickOnSend() {
        clickOnElement(sendclick);
        log.info("Clicking on send click"+ sendclick.toString()+ "<br>");
    }
    public void sendMessagetoCustomerService(String text) {
        sendTextToElement(messageText, text);
        log.info("Enter email "+messageText+ " to email field "+messageText.toString() + "<br>");
    }






}
