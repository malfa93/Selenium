package com.syntax.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage extends CommonMethods {

    @FindBy(id = "welcome")
    public WebElement welcome;

    public dashboardPage(){
        PageFactory.initElements(driver,this);
    }
}
