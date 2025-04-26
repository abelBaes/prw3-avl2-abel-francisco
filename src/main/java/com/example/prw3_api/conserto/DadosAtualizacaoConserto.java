package com.example.prw3_api.conserto;

import com.example.prw3_api.mecanico.DadosMecanico;
import com.example.prw3_api.mecanico.Mecanico;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoConserto(

        @NotNull
        Long id,

        @Pattern(regexp = "\\d{4}/\\d{2}/\\d{2}$")
        String data_saida,

        DadosMecanico mecanico
) {
}
