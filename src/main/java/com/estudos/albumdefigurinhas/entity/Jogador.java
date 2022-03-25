package com.estudos.albumdefigurinhas.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Objects;

@Entity
public class Jogador extends UIDEntity{

    public Jogador() {
    }

    private String nome;

    private String apelido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "time_id")
    @JsonIgnore
    private Time time;

    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;

    private String clube;

    private Integer numeroCamisa;

    public String getNacionalidade() {
        return nacionalidade;
    }

    @Enumerated(EnumType.STRING)
    private PosicaoJogador posicao;

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private String nacionalidade;

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
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

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public Integer getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(Integer numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public PosicaoJogador getPosicao() {
        return posicao;
    }

    public void setPosicao(PosicaoJogador posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", clube='" + clube + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                ", posicao=" + posicao +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jogador)) return false;
        Jogador jogador = (Jogador) o;
        return nome.equals(jogador.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
