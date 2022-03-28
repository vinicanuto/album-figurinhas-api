package com.estudos.albumdefigurinhas.dto;

import com.estudos.albumdefigurinhas.entity.Jogador;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Calendar;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JogadorDTO {

    private Long id;

    private String nome;

    private String apelido;

    private String posicao;

    private Calendar nascimento;

    private String nacionalidade;

    private TimeDTO time;

    private ImagemDTO imagem;

    public JogadorDTO (){

    }

    public JogadorDTO fromEntityToDTO(Jogador jogador){
        this.id = jogador.getId();
        this.nome = jogador.getNome();
        this.posicao = jogador.getPosicao().name();
        this.nascimento = jogador.getDataNascimento();
        this.nacionalidade = jogador.getNacionalidade();
        this.time = jogador.getTime() != null ? new TimeDTO().fromEntityToDTO(jogador.getTime()) : null;
        this.imagem = jogador.getImagem() != null ? new ImagemDTO().toDTO(jogador.getImagem()) : null;
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public TimeDTO getTime() {
        return time;
    }

    public void setTime(TimeDTO time) {
        this.time = time;
    }

    public ImagemDTO getImagem() {
        return imagem;
    }

    public void setImagem(ImagemDTO imagem) {
        this.imagem = imagem;
    }
}
