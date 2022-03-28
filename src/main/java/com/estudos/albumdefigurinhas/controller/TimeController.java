package com.estudos.albumdefigurinhas.controller;

import com.estudos.albumdefigurinhas.dto.ElencoDTO;
import com.estudos.albumdefigurinhas.dto.TimeDTO;
import com.estudos.albumdefigurinhas.entity.Time;
import com.estudos.albumdefigurinhas.request.TimeRequest;
import com.estudos.albumdefigurinhas.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/time")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping("{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable("id") Long id) {
        Optional<Time> time = timeService.buscaPorId(id);
        if(!time.isPresent())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(new TimeDTO().fromEntityToDTO(time.get()));
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos() {
        List<Time> times = timeService.buscarTodos();
        List<TimeDTO>timeDTOS = times
                .stream()
                .map(time -> new TimeDTO().fromEntityToDTO(time))
                .collect(Collectors.toList());
        return ResponseEntity.ok(timeDTOS);
    }

    @GetMapping("{id}/elenco")
    public ResponseEntity<?> buscarElencoPorId(@PathVariable("id") Long id) {
        Optional<Time> time = timeService.buscaPorId(id);
        if(!time.isPresent())
            return ResponseEntity.notFound().build();
        List<ElencoDTO> elenco = time.get()
                .getElenco()
                .stream()
                .map(jogador -> new ElencoDTO().fromEntityToDTO(jogador))
                .collect(Collectors.toList());

        return ResponseEntity.ok(elenco);
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody TimeRequest timeRequest) {
        Time time = timeRequest.converteParaTime();
        time = timeService.salva(time);
        return ResponseEntity.ok(new TimeDTO().fromEntityToDTO(time));
    }
}
