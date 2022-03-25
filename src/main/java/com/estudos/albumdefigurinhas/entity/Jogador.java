package com.estudos.albumdefigurinhas.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Jogador extends UIDEntity{

    public Jogador() {
    }


    @ManyToOne
    @JoinColumn(name = "time_id")
    private Time time;

    private String nome;

    private String apelido;

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

    public Time getTime() {
        return time;
    }


    public void setTime(Time time) {
        this.time = time;
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
}
