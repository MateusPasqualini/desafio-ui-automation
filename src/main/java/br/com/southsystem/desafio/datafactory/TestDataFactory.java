package br.com.southsystem.desafio.datafactory;

import br.com.southsystem.desafio.builder.TestDataObject;

public class TestDataFactory {

    public TestDataObject createData() {
        return TestDataObject.builder().
                applyValue("2500").
                investValue("2500").
                periodValue("5").
                build();
    }
}
