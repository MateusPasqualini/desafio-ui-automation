package br.com.southsystem.desafio.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class TestDataObject {
    private String applyValue;
    private String investValue;
    private String periodValue;
}
