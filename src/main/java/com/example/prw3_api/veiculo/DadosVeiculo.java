package com.example.prw3_api.veiculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosVeiculo(

        @NotNull //DADO OBRIGATÓRIO CONFORME SLIDE
        Marca marca,

        @NotNull //DADO OBRIGATÓRIO CONFORME SLIDE
        String modelo,

        @NotNull //DADO OBRIGATÓRIO CONFORME SLIDE
        @Pattern(regexp = "\\d{4}")
        String ano,

        String cor
) {}
