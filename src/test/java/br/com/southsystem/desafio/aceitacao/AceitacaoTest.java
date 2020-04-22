package br.com.southsystem.desafio.aceitacao;

import br.com.southsystem.desafio.TestBase;
import br.com.southsystem.desafio.builder.TestDataObject;
import br.com.southsystem.desafio.datadriven.TestDataProvider;
import br.com.southsystem.desafio.pageobjects.GeneratePage;
import br.com.southsystem.desafio.pageobjects.ResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AceitacaoTest extends TestBase {

    @Test(dataProvider = "formData", dataProviderClass = TestDataProvider.class)
    public void deveEfetuarSimulacaoPFMensal(TestDataObject formData) {

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectPerson().
                fillFormFields(formData).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em 5 meses você terá guardado");
    }

    @Test(dataProvider = "formData", dataProviderClass = TestDataProvider.class)
    public void deveEfetuarSimulacaoPJMensal(TestDataObject formData) {

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectCompany().
                fillFormFields(formData).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em 5 meses você terá guardado");
    }

    @Test(dataProvider = "formData", dataProviderClass = TestDataProvider.class)
    public void deveEfetuarSimulacaoPFAnual(TestDataObject formData) {

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectPerson().
                selectPeriodType("Anos").
                fillFormFields(formData).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em 60 meses você terá guardado");
    }

    @Test(dataProvider = "formData", dataProviderClass = TestDataProvider.class)
    public void deveEfetuarSimulacaoPJAnual(TestDataObject formData) {

        ResultPage resultPage = GeneratePage.simulationPage().
                goToSimulationPage().
                selectCompany().
                selectPeriodType("Anos").
                fillFormFields(formData).
                submitSimulationForm();
        Assert.assertEquals(resultPage.getPeriod(), "Em 60 meses você terá guardado");
    }
}
