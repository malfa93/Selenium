package com.syntax.test;

import com.syntax.pages.LoginPageWithPageFactory;
import com.syntax.testBase.BaseClass;

public class loginPageTestWithPageFactory {

    public static void main(String[] args) {

        // open browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        LoginPageWithPageFactory loginWPF = new LoginPageWithPageFactory();

        loginWPF.username.sendKeys("Admin");
        loginWPF.password.sendKeys("Hum@nhrm123");
        loginWPF.loginBtn.click();

        // close browser
        //BaseClass.tearDown();


    }
}
