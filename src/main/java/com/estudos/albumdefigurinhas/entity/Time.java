package com.estudos.albumdefigurinhas.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;
import java.util.Set;

@Entity
public class Time extends UIDEntity{

    public Time() {

    }

    private String nome;

    private String apelido;

    @Temporal(TemporalType.DATE)
    private Calendar dataFundacao;

    @OneToMany
    private Set<Jogador> elenco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Calendar getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Calendar dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Set<Jogador> getElenco() {
        return elenco;
    }

    public void setElenco(Set<Jogador> elenco) {
        this.elenco = elenco;
    }
}
