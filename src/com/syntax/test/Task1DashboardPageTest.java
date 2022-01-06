package com.syntax.test;

import com.syntax.pages.LoginPageWithPageFactory;
import com.syntax.pages.dashboardPage;
import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class Task1DashboardPageTest {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        LoginPageWithPageFactory loginWPF = new LoginPageWithPageFactory();



        WebElement username = loginWPF.username;
        WebElement password = loginWPF.password;
        WebElement loginBtn = loginWPF.loginBtn;



        CommonMethods.sendText(username,"Admin");
        CommonMethods.sendText(password,"Hum@nhrm123");
        loginBtn.click();



        dashboardPage dashboardPage = new dashboardPage();

        WebElement welcome = dashboardPage.welcome;

        System.out.println(welcome.getText());

        CommonMethods.takeScreenShot("Welcome Admin");
    }
}
