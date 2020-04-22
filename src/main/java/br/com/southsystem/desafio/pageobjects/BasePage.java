package br.com.southsystem.desafio.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    private WebDriverWait wait;


    BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public WebElement waitForVisibilityOf(WebElement element){
        wait.until(webDriver -> element.isDisplayed());
        return element;
    }

    public WebElement waitForClickabilityOf(WebElement element) {
        wait.until(driverLambda -> element.isDisplayed() && element.isEnabled());
        return element;
    }

    public WebElement waitForClickabilityOf(By elementBy) {
        WebElement element = driver.findElement(elementBy);
        wait.until(driverLambda -> element.isDisplayed() && element.isEnabled());
        return element;
    }

    public WebElement waitForInvisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
        return element;
    }
}
