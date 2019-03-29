package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPage {
    public ListingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "fjahdfkja")
    public WebElement address;

    @FindBy(id = "fjahdfkja")
    public WebElement agent;

    @FindBy(id = "fjahdfkja")
    public WebElement map;




}
