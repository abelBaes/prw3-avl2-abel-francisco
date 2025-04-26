package com.example.prw3_api.mecanico;

import jakarta.validation.constraints.NotNull;

public record DadosMecanico(

        @NotNull //DADO OBRIGATÓRIO CONFORME SLIDE
        String nome,

        Integer experiencia) {
}
