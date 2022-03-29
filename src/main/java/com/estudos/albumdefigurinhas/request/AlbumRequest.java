package com.estudos.albumdefigurinhas.request;

import com.estudos.albumdefigurinhas.entity.AlbumFigurinhas;
import com.estudos.albumdefigurinhas.entity.Time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AlbumRequest implements Serializable {

    private String nome;

    private List<Long> times;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Long> getTimes() {
        return times;
    }

    public AlbumFigurinhas converteParaAlbum(){
        AlbumFigurinhas albumFigurinhas = new AlbumFigurinhas();
        albumFigurinhas.setNome(this.nome);
        Set<Time> times = getTimes().stream().map(t -> new Time(t)).collect(Collectors.toSet());
        albumFigurinhas.setTimes(times);
        return albumFigurinhas;
    }

    public void setTimes(List<Long> times) {
        this.times = times;
    }
}
