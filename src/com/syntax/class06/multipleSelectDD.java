package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class multipleSelectDD {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        WebElement statesDD = driver.findElement(By.cssSelector("select#multi-select"));

        Select select = new Select(statesDD);

        boolean isMul = select.isMultiple();

        System.out.println(isMul);

        select.selectByIndex(2);

        Thread.sleep(2000);

        select.selectByVisibleText("Texas");

        Thread.sleep(2000);

        select.selectByValue("Ohio");

        Thread.sleep(2000);

        select.deselectByIndex(5);

        List<WebElement> allOptions = select.getOptions();
        Iterator<WebElement> itr = allOptions.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next().getText());
        }






    }
}
