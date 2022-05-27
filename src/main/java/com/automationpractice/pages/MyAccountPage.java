package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends Utility {
    private static final Logger log= LogManager.getLogger(MyAccountPage.class);

    public MyAccountPage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement addressClick;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='last_item item box']//li")
    List<WebElement>addressText;

    public void clickOnMyAddress() {
        clickOnElement(addressClick);
        log.info("Clicking on  address click"+ addressClick.toString()+ "<br>");
    }


    public String[]getAddressText(){
        String[]a=new String[8];
        for(int i=1;i<addressText.size()-1;i++){
            String b=addressText.get(i).getText();
            a[i-1]=b;
        }
        return  a;
    }






}
