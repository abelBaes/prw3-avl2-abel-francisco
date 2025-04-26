package com.example.prw3_api.conserto;


import com.example.prw3_api.mecanico.Mecanico;
import com.example.prw3_api.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "consertos")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Conserto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dataEntrada;
    private String dataSaida;


    @Embedded
    private Mecanico mecanico;
    @Embedded
    private Veiculo veiculo;

    private Boolean ativo;


    public Conserto(DadosCadastroConserto dados){
        this.ativo = true;
        this.dataEntrada = dados.data_entrada();
        this.dataSaida = dados.data_saida();
        this.veiculo = new Veiculo(dados.veiculo());
        this.mecanico = new Mecanico(dados.mecanico());
    }

    public void atualizarInformacoes(DadosAtualizacaoConserto dados){
        if(dados.data_saida() != null) this.dataSaida = dados.data_saida();
        if(dados.mecanico() != null)  this.mecanico.atualizarInformacoes(dados.mecanico());
    }

    public void excluir(){
        this.ativo = false;
    }

}
