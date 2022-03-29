package com.estudos.albumdefigurinhas.dto;

import com.estudos.albumdefigurinhas.entity.AlbumFigurinhas;
import com.estudos.albumdefigurinhas.entity.Time;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class AlbumDTO implements Serializable {

    private Long id;

    private String nome;

    private List<Long> times;

    public AlbumDTO converteParaDTO(AlbumFigurinhas albumFigurinhas){
        this.id =albumFigurinhas.getId();
        this.nome = albumFigurinhas.getNome();
        this.times = albumFigurinhas.getTimes().stream().map(Time::getId).collect(Collectors.toList());
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Long> getTimes() {
        return times;
    }

    public void setTimes(List<Long> times) {
        this.times = times;
    }
}
