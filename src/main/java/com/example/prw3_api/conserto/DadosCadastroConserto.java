package com.example.prw3_api.conserto;

import com.example.prw3_api.mecanico.DadosMecanico;
import com.example.prw3_api.veiculo.DadosVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroConserto(

        //APENAS VALIDACAO REGEX
        @Pattern(regexp = "\\d{4}/\\d{2}/\\d{2}$")
        String data_entrada,
        //APENAS VALIDACAO REGEX
        @Pattern(regexp = "\\d{4}/\\d{2}/\\d{2}$")
        String data_saida,

        //POSSUI DADO OBRIGATÓRIO CONFORME SLIDE
        @NotNull
        @Valid
        DadosMecanico mecanico,

        //POSSUI DADO OBRIGATÓRIO CONFORME SLIDE
        @NotNull
        @Valid
        DadosVeiculo veiculo){
}
