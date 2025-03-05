package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage {
    private WebDriver driver;
    private By bankManagerLogin = By.cssSelector("body > div.ng-scope > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickBankManagerLogin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(bankManagerLogin));
        driver.findElement(bankManagerLogin).click();
    }

}
