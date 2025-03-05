package org.example.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenAccount {
    private WebDriver driver;
    private By customerDropDown = By.id("userSelect");
    private By currencyDropDown = By.id("currency");
    private By proccessButton = By.cssSelector("body > div.ng-scope > div > div.ng-scope > div > div.ng-scope > div > div > form > button");

    public OpenAccount(WebDriver driver) {
        this.driver = driver;
    }

    public void setCustomerDropDown(String customerName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(customerDropDown));
        driver.findElement(customerDropDown).click();
    }
    public void setCurrencyDropDown(String currencyName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(customerDropDown));
        driver.findElement(currencyDropDown).click();
    }
    public void clickProccessButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(proccessButton));
        driver.findElement(proccessButton).click();
    }
}
