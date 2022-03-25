package com.estudos.albumdefigurinhas.request;

import com.estudos.albumdefigurinhas.entity.Jogador;
import com.estudos.albumdefigurinhas.entity.PosicaoJogador;

import java.io.Serializable;
import java.util.Calendar;

public class JogadorRequest implements Serializable {

    private String nome;

    private String apelido;

    private Calendar dataNascimento;

    private String nacionalidade;

    private PosicaoJogador posicao;


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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public PosicaoJogador getPosicao() {
        return posicao;
    }

    public void setPosicao(PosicaoJogador posicao) {
        this.posicao = posicao;
    }

    public Jogador converteParaJogador(){
        Jogador jogador = new Jogador();

        jogador.setNome(this.nome);
        jogador.setApelido(this.apelido);
        jogador.setNacionalidade(this.nacionalidade);
        jogador.setDataNascimento(this.dataNascimento);
        jogador.setPosicao(this.posicao);

        return jogador;
    }
}
