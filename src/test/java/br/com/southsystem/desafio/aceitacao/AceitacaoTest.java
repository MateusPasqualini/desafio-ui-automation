package br.com.southsystem.desafio.aceitacao;

import br.com.southsystem.desafio.TestBase;
import br.com.southsystem.desafio.pageobjects.GeneratePage;
import br.com.southsystem.desafio.pageobjects.ResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AceitacaoTest extends TestBase {

    @Test
    public void deveEfetuarSimulacaoPFMensal() throws InterruptedException {
        String savePeriodValue = "2";

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectPerson().
                fillFormFields("2000", "2000", savePeriodValue).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em " + savePeriodValue + " meses você terá guardado");
    }

    @Test
    public void deveEfetuarSimulacaoPJMensal() throws InterruptedException {
        String savePeriodValue = "2";

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectCompany().
                fillFormFields("2000", "2000", savePeriodValue).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em " + savePeriodValue + " meses você terá guardado");
    }

    @Test
    public void deveEfetuarSimulacaoPFAnual() throws InterruptedException {
        String savePeriodValue = "2";

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectPerson().
                selectPeriodType("Anos").
                fillFormFields("2000", "2000", savePeriodValue).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em " + savePeriodValue + " meses você terá guardado");
    }

    @Test
    public void deveEfetuarSimulacaoPJAnual() throws InterruptedException {
        String savePeriodValue = "2";

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectCompany().
                selectPeriodType("Anos").
                fillFormFields("2000", "2000", savePeriodValue).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em " + savePeriodValue + " meses você terá guardado");
    }
}
