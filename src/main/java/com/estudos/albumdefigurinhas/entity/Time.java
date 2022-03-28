package com.estudos.albumdefigurinhas.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

@Entity
public class Time extends StandardEntity{

    public Time() {

    }

    private String nome;

    private String apelido;

    @Temporal(TemporalType.DATE)
    private Calendar dataFundacao;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Jogador> elenco = new java.util.LinkedHashSet<>();

    private Imagem imagem;

    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    public void setElenco(Set<Jogador> elenco) {
        this.elenco = elenco;
    }

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

    public void addJogador(Jogador jogador){
        this.getElenco().add(jogador);
        jogador.setTime(this);
    }


    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataFundacao=" + dataFundacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time)) return false;
        Time time = (Time) o;
        return nome.equals(time.nome) && Objects.equals(apelido, time.apelido) && dataFundacao.equals(time.dataFundacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, apelido, dataFundacao);
    }
}
