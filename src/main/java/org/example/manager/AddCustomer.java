package org.example.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AddCustomer{
    private WebDriver driver;

    private By firstName = By.cssSelector("input[ng-model='fName']");
    private By lastName = By.cssSelector("input[ng-model='lName']");
    private By postCode = By.cssSelector("input[ng-model='postCd']");
    private By addCustomerbutton = By.cssSelector("button[type='submit']");

    public AddCustomer(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(String customerFirstName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
        driver.findElement(firstName).sendKeys(customerFirstName);
    }
    public void setLastName(String customerLastName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName));
        driver.findElement(lastName).sendKeys(customerLastName);
    }
    public void setPostCode(String postCd){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(postCode));
        driver.findElement(postCode).sendKeys(postCd);
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void clickAddCustomer(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(addCustomerbutton));
        driver.findElement(addCustomerbutton).click();
    }


}
