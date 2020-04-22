package br.com.southsystem.desafio.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class TestData {
    private String applyValue;
    private String investValue;
    private Integer periodValue;
    private Integer expectedSavings;
}
