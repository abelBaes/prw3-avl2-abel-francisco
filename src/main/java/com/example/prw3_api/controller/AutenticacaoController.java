package com.example.prw3_api.controller;

import com.example.prw3_api.usuario.DadosAutenticacao;
import com.example.prw3_api.usuario.Usuario;
import com.example.prw3_api.util.security.DadosTokenJWT;
import com.example.prw3_api.util.security.PW3TokenService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    private final AuthenticationManager manager;
    private final PW3TokenService tokenService;

    public AutenticacaoController(AuthenticationManager manager, PW3TokenService tokenService) {
        this.manager = manager;
        this.tokenService = tokenService;
    }

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados) {

        var token = new UsernamePasswordAuthenticationToken( dados.login(), dados.senha() );
        var authentication = manager.authenticate(token);
        var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());
        return ResponseEntity.ok( new DadosTokenJWT(tokenJWT));

    }

}
