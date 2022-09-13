package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.example.BasePage.driver;

public class AmazonHomePage extends Utils{
    public void validateCurrentUrl(){
        verifyCurrentURL("https://www.amazon.co.uk/");
    }

    public void loginToAmazon(){
        clickElement(By.id("nav-link-accountList-nav-line-1"));
        typeText(By.id("ap_email"),"emeaintegrationautomation@outlook.com");
        clickElement(By.className("a-button-input"));
        typeText(By.id("ap_password"),"AutomationTestUK");
        clickElement(By.className("a-button-input"));
    }
    public void searchAnItem(){
        clickElement(By.id("sp-cc-accept"));
        typeText(By.id("twotabsearchtextbox"),"desk lamp");
        clickElement(By.id("nav-search-submit-button"));}
    public void verifySearchResults(){
        List<WebElement> productTitles = driver.findElements(By.xpath("//span[@class=\"a-size-base a-color-base a-text-normal\"]"));
        System.out.println(productTitles.size());
        List<String> productName = new ArrayList<>();
        for (WebElement e : productTitles) {
            productName.add(e.getText());
            System.out.println(e.getText());
            }
    }
    public void selectItemToAdd(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(By.xpath("//img[@data-image-index=\"8\"]"));

    }
}
