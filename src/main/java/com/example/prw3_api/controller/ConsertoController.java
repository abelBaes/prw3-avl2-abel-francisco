package com.example.prw3_api.controller;


import com.example.prw3_api.conserto.Conserto;
import com.example.prw3_api.conserto.ConsertoRepository;
import com.example.prw3_api.conserto.DadosCadastroConserto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consertos")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroConserto dados){

        repository.save(new Conserto(dados));

    }
}
