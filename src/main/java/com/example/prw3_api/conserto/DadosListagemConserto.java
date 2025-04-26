package com.example.prw3_api.conserto;

import com.example.prw3_api.veiculo.Marca;

public record DadosListagemConserto(Long id,String data_entrada, String data_saida,String nome, Marca marca, String modelo) {

    public DadosListagemConserto(Conserto conserto){
        this(conserto.getId(), conserto.getDataEntrada(), conserto.getDataSaida(), conserto.getMecanico().getNome(),
                conserto.getVeiculo().getMarca(), conserto.getVeiculo().getModelo());
    }
}
