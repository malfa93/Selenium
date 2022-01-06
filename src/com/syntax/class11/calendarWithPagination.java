package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendarWithPagination {

    public static String url = "https://www.sastaticket.pk/";



    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement DepDate = driver.findElement(By.xpath("(//span[@class='dt_label'])[1]"));

        DepDate.click();


        //find the month

        WebElement month = driver.findElement(By.xpath("(//div[@class='react-datepicker__current-month'])[1]"));

        // print the desired month

        System.out.println(month.getText());

        //get next button

        WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next Month']"));


        //get to the month of Sep


        boolean notfound= true;

        while(notfound){
            if(month.getText().equalsIgnoreCase("September 2022")){

                System.out.println(month.getText());
                notfound=false;

                List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='react-datepicker__month'])[1]/div/div"));


                for (WebElement date:dates
                     ) {
                    if(date.getText().equalsIgnoreCase("15")){
                        date.click();
                        break;
                    }
                }
            }
            else{
                nextButton.click();

            }
        }




    }
}
