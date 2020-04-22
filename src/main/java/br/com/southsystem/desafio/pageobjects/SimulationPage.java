package br.com.southsystem.desafio.pageobjects;

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
    private WebElement saveValue;

    @FindBy(how = How.ID, using = "tempo")
    private WebElement savePeriod;

    @FindBy(how = How.CSS, using = "button[type=\"submit\"]")
    private WebElement submitButton;

    @FindBy(how = How.ID, using = "valorAplicar-error")
    private WebElement applicationValueErro;

    @FindBy(how = How.ID, using = "valorInvestir-error")
    private WebElement saveValueErro;

    SimulationPage(WebDriver driver) {
        super(driver);
    }

    public SimulationPage goToSimulationPage() {
        driver.get(BASEURL);
        return this;
    }
}
