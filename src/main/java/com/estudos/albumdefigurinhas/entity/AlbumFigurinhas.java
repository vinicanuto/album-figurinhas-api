package com.estudos.albumdefigurinhas.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class AlbumFigurinhas extends StandardEntity{

    private String nome;

    @OneToMany
    private Set<Time> times;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Time> getTimes() {
        return times;
    }

    public void setTimes(Set<Time> times) {
        this.times = times;
    }
}
