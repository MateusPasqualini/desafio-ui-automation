package br.com.southsystem.desafio.aceitacao;

import br.com.southsystem.desafio.testbase.TestBase;
import br.com.southsystem.desafio.builder.TestData;
import br.com.southsystem.desafio.datadriven.TestDataProvider;
import br.com.southsystem.desafio.pageobjects.GeneratePage;
import br.com.southsystem.desafio.pageobjects.ResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AceitacaoTest extends TestBase {

    @Test(dataProvider = "formData", dataProviderClass = TestDataProvider.class)
    public void deveEfetuarSimulacaoPFMensal(TestData formData) {

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectPerson().
                fillFormFields(formData).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em " + formData.getPeriodValue() + " meses você terá guardado");
        Assert.assertEquals(resultPage.getSavings(), "R$ " + formData.getExpectedSavings());
    }

    @Test(dataProvider = "formData", dataProviderClass = TestDataProvider.class)
    public void deveEfetuarSimulacaoPJMensal(TestData formData) {

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectCompany().
                fillFormFields(formData).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em " + formData.getPeriodValue() + " meses você terá guardado");
        Assert.assertEquals(resultPage.getSavings(), "R$ " + formData.getExpectedSavings());
    }

    @Test(dataProvider = "formData", dataProviderClass = TestDataProvider.class)
    public void deveEfetuarSimulacaoPFAnual(TestData formData) {

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectPerson().
                selectPeriodToYears().
                fillFormFields(formData).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em " + formData.getPeriodValue() * 12 + " meses você terá guardado");
    }

    @Test(dataProvider = "formData", dataProviderClass = TestDataProvider.class)
    public void deveEfetuarSimulacaoPJAnual(TestData formData) {

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectCompany().
                selectPeriodToYears().
                fillFormFields(formData).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em " + formData.getPeriodValue() * 12 + " meses você terá guardado");
    }
}
