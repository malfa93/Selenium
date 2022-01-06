package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
    public static void main(String[] args) {

        //set the path to the driver Executable
        //for Windows user must use .exe but mac users don't need a .exe
        //Error: The driver executable does not exist: (refers that the path t your driver is not correct) --> Check Path.

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Calling a get method to get to a particular website
        driver.get("http://www.google.com");

        // returns the current url loaded in the browser
        String url=driver.getCurrentUrl();
        System.out.println("The current URL loaded in the browser is: "+url);

        // retuurns the totle of the current page in the browser
        String title=driver.getTitle();
        System.out.println("The current Title of the page is: "+title);

        // close the browser
        driver.quit();
    }
}
