package com.estudos.albumdefigurinhas.controller;

import com.estudos.albumdefigurinhas.entity.Jogador;
import com.estudos.albumdefigurinhas.request.JogadorRequest;
import com.estudos.albumdefigurinhas.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/jogador")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public ResponseEntity<?> buscarTodos() {
        List<Jogador> jogadores = jogadorService.buscarTodos();
        return ResponseEntity.ok(jogadores);
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody JogadorRequest jogadorRequest) {
        Jogador jogador = jogadorRequest.converteParaJogador();
        jogador = jogadorService.salva(jogador);
        return ResponseEntity.ok(jogador);
    }
}
