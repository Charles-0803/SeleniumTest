package org.example.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManagerDashboard {
    private WebDriver driver;
    private By addCustomer = By.cssSelector("body > div.ng-scope > div > div.ng-scope > div > div.center > button:nth-child(1)");
    private By openAccount = By.cssSelector("body > div.ng-scope > div > div.ng-scope > div > div.center > button:nth-child(2)");
    private By deleteAccount = By.cssSelector("body > div.ng-scope > div > div.ng-scope > div > div.center > button:nth-child(3)");

    public ManagerDashboard(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAddCustomerButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(addCustomer));
        driver.findElement(addCustomer).click();
    }
    public void clickOpenAccountButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(openAccount));
        driver.findElement(openAccount).click();
    }
    public void clickDeleteAccountButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteAccount));
        driver.findElement(deleteAccount).click();
    }
}
