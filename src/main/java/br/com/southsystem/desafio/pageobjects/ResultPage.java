package br.com.southsystem.desafio.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultPage extends BasePage {

    @FindBy(how = How.CSS, using = "span[class=\"texto\"]")
    private WebElement period;

    @FindBy(how = How.CSS, using = "span[class=\"valor\"]")
    private WebElement savings;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public String getPeriod() {
        return waitForVisibilityOf(period).getText();
    }

    public String getSavings(){
        return waitForVisibilityOf(savings).getText();
    }
}
