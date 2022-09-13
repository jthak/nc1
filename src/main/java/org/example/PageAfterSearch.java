package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PageAfterSearch extends Utils {
     public void changeQuantityInBasket(){
         clickElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
         String NumberOfItems = driver.findElement(By.id("nav-cart-count")).getText();
         Assert.assertTrue(NumberOfItems.contains("1"));
         clickElement(By.id("nav-cart-count"));
     }
}
