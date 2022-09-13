package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.example.BasePage.driver;

public class Utils  extends BasePage{
    public String RandomDate(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
        String CurrentDate = formatter.format(date);
        return CurrentDate;}

    public void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    public void clickElement(By by)
    {
        driver.findElement(by).click();
    }
    public void getTextFromElement(By by)
    {
        driver.findElement(by).getText();
    }
    public static void verifyCurrentURL(String url){
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }
}
