package br.com.southsystem.desafio.datafactory;

import br.com.southsystem.desafio.builder.TestData;

public class TestDataFactory {

    public TestData createData() {
        return TestData.builder().
                applyValue("2500").
                investValue("2500").
                periodValue(5).
                expectedSavings(151).
                build();
    }
}
