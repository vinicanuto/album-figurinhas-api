package com.estudos.albumdefigurinhas.controller;

import com.estudos.albumdefigurinhas.entity.Time;
import com.estudos.albumdefigurinhas.request.TimeRequest;
import com.estudos.albumdefigurinhas.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
        return ResponseEntity.ok(time.get());
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody TimeRequest timeRequest) {
        Time time = timeRequest.converteParaTime();
        time = timeService.salva(time);
        return ResponseEntity.ok(time);
    }
}
