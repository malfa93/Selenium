package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendar {

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //        login code     username:Admin  password :Hum@nhrm123
//        for username
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");

//        for password
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");

//        for login btn
        WebElement loginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
//        click login btn
        loginBtn.click();

        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();

        // ************ Dealing with calendars*******************
        WebElement calButton = driver.findElement(By.cssSelector("input#calFromDate"));

        calButton.click();

        //find month

        WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));

        // Use select class

        Select select = new Select(month);
        select.selectByVisibleText("Aug");


        //select year

        WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));

        Select selectY = new Select(year);
        selectY.selectByValue("2020");

        // select day

        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for (WebElement date:days
             ) {

            String dateText = date.getText();

            if(dateText.equalsIgnoreCase("15")){
                date.click();
            }

        }

    }
}
