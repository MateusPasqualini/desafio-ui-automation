package br.com.southsystem.desafio.pageobjects;

import br.com.southsystem.desafio.builder.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.commons.PropertiesManager;

public class SimulationPage extends BasePage {

    private static final String BASEURL = PropertiesManager.getInstance().getProperty("baseurl");

    @FindBy(how = How.CSS, using = "input[value = \"paraVoce\"]")
    private WebElement radialPerson;

    @FindBy(how = How.CSS, using = "input[value = \"paraEmpresa\"]")
    private WebElement radialCompany;

    @FindBy(how = How.ID, using = "valorAplicar")
    private WebElement applicationValue;

    @FindBy(how = How.ID, using = "valorInvestir")
    private WebElement investValue;

    @FindBy(how = How.ID, using = "tempo")
    private WebElement savePeriod;

    @FindBy(how = How.CSS, using = "button[type=\"submit\"]")
    private WebElement submitButton;

    @FindBy(how = How.CSS, using = "a[class=\"btSelect\"]")
    private WebElement dropDown;

    @FindBy(how = How.CSS, using = "a[rel=\"M\"]")
    private WebElement month;

    @FindBy(how = How.CSS, using = "a[rel=\"A\"]")
    private WebElement year;

    @FindBy(how = How.ID, using = "valorAplicar-error")
    private WebElement applicationValueErro;

    @FindBy(how = How.ID, using = "valorInvestir-error")
    private WebElement saveValueErro;

    public SimulationPage(WebDriver driver) {
        super(driver);
    }

    public SimulationPage goToSimulationPage() {
        driver.get(BASEURL);
        return this;
    }

    public SimulationPage selectPerson() {
        waitForClickabilityOf(radialPerson).click();
        return this;
    }

    public SimulationPage selectCompany() {
        waitForClickabilityOf(radialCompany).click();
        return this;
    }

    public SimulationPage fillFormFields(TestData data) {
        waitForVisibilityOf(applicationValue).sendKeys(data.getApplyValue());
        waitForVisibilityOf(investValue).sendKeys(data.getInvestValue());
        waitForVisibilityOf(savePeriod).sendKeys(String.valueOf(data.getPeriodValue()));
        return this;
    }

    public SimulationPage selectPeriodToYears() {
        waitForClickabilityOf(dropDown).click();
        waitForClickabilityOf(By.xpath("//a[contains(text(), \"Anos\")]")).click();
        return this;
    }

    public ResultPage submitSimulationForm() {
        waitForClickabilityOf(submitButton).click();
        return GeneratePage.resultPage();
    }
}
