package com.syntax.utils;

import com.syntax.testBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {

    /**
     * Sends text to a given Element
     * @param element => WebElement variable
     * @param text => The text that you want to send
     */

    public static void sendText(WebElement element, String text){

        element.clear();
        element.sendKeys(text);

    }

    public void switchToFrame(int index){

        driver.switchTo().frame(index);

    }


    public static void takeScreenShot(String fileName){

        TakesScreenshot ts = (TakesScreenshot) driver;

        // to take the screenshot, this step takes the screenshot
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        //save the screenshot in our computer

        try{
            FileUtils.copyFile(sourceFile, new File("Screenshot/Task1/"+fileName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
