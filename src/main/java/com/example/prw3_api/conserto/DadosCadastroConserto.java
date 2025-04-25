package com.example.prw3_api.conserto;

import com.example.prw3_api.mecanico.DadosCadastroMecanico;
import com.example.prw3_api.veiculo.DadosCadastroVeiculo;

public record DadosCadastroConserto(String data_entrada, String data_saida, DadosCadastroMecanico mecanico, DadosCadastroVeiculo veiculo){
}
