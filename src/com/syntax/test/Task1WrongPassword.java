package com.syntax.test;

import com.syntax.pages.LoginPageWithPageFactory;
import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class Task1WrongPassword {
    public static void main(String[] args) {

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        LoginPageWithPageFactory loginWPF = new LoginPageWithPageFactory();



        WebElement username = loginWPF.username;
        WebElement password = loginWPF.password;
        WebElement loginBtn = loginWPF.loginBtn;

        CommonMethods.sendText(username,"sdfjk");
        CommonMethods.sendText(password,"fjdf");
        loginBtn.click();

        CommonMethods.takeScreenShot("Login Fail");

    }
}
