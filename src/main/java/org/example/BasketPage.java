package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasketPage extends Utils{
    public void validateSubtotal(){
//        Select drpdown = new Select(driver.findElement(By.className("a-button-text a-declarative")));
//        drpdown.selectByValue("2");
        clickElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]"));
        clickElement(By.xpath("//li[3]//a[@id=\"quantity_2\"]"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String subtotal = driver.findElement(By.xpath("//span[@id=\"sc-subtotal-label-activecart\"]")).getText();
        Assert.assertEquals(subtotal,"Subtotal (2 items):");
    }

}
