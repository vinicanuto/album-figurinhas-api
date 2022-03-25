package com.estudos.albumdefigurinhas.controller;

import com.estudos.albumdefigurinhas.entity.Jogador;
import com.estudos.albumdefigurinhas.entity.Time;
import com.estudos.albumdefigurinhas.request.AdicionaTimeRequest;
import com.estudos.albumdefigurinhas.request.JogadorRequest;
import com.estudos.albumdefigurinhas.service.JogadorService;
import com.estudos.albumdefigurinhas.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/jogador")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @Autowired
    private TimeService timeService;

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

    @PostMapping("{id}/adicionarTime")
    public ResponseEntity<?> adicionaTime(@PathVariable("id") Long id, @RequestBody AdicionaTimeRequest adicionaTimeRequest) throws Exception {
        Optional<Time> time = timeService.buscaPorId(adicionaTimeRequest.getTimeId());
        Optional<Jogador> jogador = jogadorService.buscaPorId(id);
        if (time.isPresent() && jogador.isPresent()){

            time.get().addJogador(jogador.get());
            Time timePersistido = timeService.salva(time.get());
            if(timePersistido.getElenco().contains(jogador.get()));
                return ResponseEntity.noContent()
                        .build();
        }
        return ResponseEntity.badRequest().build();
    }
}
