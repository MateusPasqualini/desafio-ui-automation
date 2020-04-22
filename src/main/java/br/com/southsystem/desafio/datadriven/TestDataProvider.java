package br.com.southsystem.desafio.datadriven;

import br.com.southsystem.desafio.datafactory.TestDataFactory;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider
    public Object[] formData() {
        return new Object[]{
                new TestDataFactory().createData()
        };
    }
}
