package com.example.prw3_api.mecanico;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {

    private String nome;
    private Integer experiencia;

    public Mecanico(DadosMecanico dados){

        this.nome = dados.nome();
        this.experiencia = dados.experiencia();
    }

    public void atualizarInformacoes(DadosMecanico dados){
        if(dados.nome() != null) this.nome = dados.nome();
        if(dados.experiencia() != null) this.experiencia = dados.experiencia();
    }

}
