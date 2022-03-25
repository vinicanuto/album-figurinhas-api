package com.estudos.albumdefigurinhas.service;

import com.estudos.albumdefigurinhas.entity.Jogador;
import com.estudos.albumdefigurinhas.entity.Time;
import com.estudos.albumdefigurinhas.repository.JogadorRepository;
import com.estudos.albumdefigurinhas.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeService {

    @Autowired
    private TimeRepository timeRepository;

    @Autowired
    private JogadorRepository jogadorRepository;

    public Time salva(Time time){
        return timeRepository.save(time);
    }

    public Optional<Time> buscaPorId(Long id){
        return timeRepository.findById(id);
    }

}
