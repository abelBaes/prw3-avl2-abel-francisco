package com.example.prw3_api.conserto;

import com.example.prw3_api.mecanico.DadosMecanico;
import com.example.prw3_api.mecanico.Mecanico;
import com.example.prw3_api.veiculo.DadosVeiculo;
import com.example.prw3_api.veiculo.Veiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosDetalhamentoConserto(Long id, String data_entrada, String data_saida, Mecanico mecanico, Veiculo veiculo){

    public DadosDetalhamentoConserto(Conserto conserto){
        this(conserto.getId(), conserto.getDataEntrada(), conserto.getDataSaida(), conserto.getMecanico(), conserto.getVeiculo());
    }
}
