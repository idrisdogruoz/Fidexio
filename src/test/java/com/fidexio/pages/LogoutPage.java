package com.fidexio.pages;

import com.fidexio.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public  LogoutPage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//span[@class='oe_topbar_name']")
    public WebElement usernamebtn;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutbtn;

}
