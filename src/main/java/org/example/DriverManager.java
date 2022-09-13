package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.example.BasePage.driver;

public class DriverManager extends Utils{
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/");
    }
    public void closeBrowser(){
       // driver.quit();
    }
}
