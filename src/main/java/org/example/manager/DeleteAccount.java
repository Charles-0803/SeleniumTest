package org.example.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteAccount {
    private WebDriver driver;
    private By searchCustomer = By.cssSelector("body > div.ng-scope > div > div.ng-scope > div > div.ng-scope > div > form > div > div > input");
    private By deleteButton = By.cssSelector("body > div.ng-scope > div > div.ng-scope > div > div.ng-scope > div > div > table > tbody > tr > td:nth-child(5) > button");

    public DeleteAccount(WebDriver driver) {
        this.driver = driver;
    }
    public void setSearchCustomer(String customer) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchCustomer));
        driver.findElement(searchCustomer).sendKeys(customer);
    }
    public void clickDeleteButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchCustomer));
        driver.findElement(deleteButton).click();
    }
    public void clearSearchCustomer() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchCustomer));
        driver.findElement(searchCustomer).clear();
    }
}
