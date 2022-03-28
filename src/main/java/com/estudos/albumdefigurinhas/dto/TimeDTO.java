package com.estudos.albumdefigurinhas.dto;

import com.estudos.albumdefigurinhas.entity.Time;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Calendar;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeDTO implements Serializable {

    private Long id;

    private String nome;

    private String apelido;

    private Calendar dataFundacao;

    private ImagemDTO imagem;

    public TimeDTO() {
    }

    public ImagemDTO getImagem() {
        return imagem;
    }

    public void setImagem(ImagemDTO imagem) {
        this.imagem = imagem;
    }

    public TimeDTO fromEntityToDTO(Time time){
        this.id=time.getId();
        this.nome=time.getNome();
        this.apelido=time.getApelido();
        this.dataFundacao=time.getDataFundacao();
        this.imagem=time.getImagem() != null ? new ImagemDTO().toDTO(time.getImagem()) : null;
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

    public Calendar getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Calendar dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
}
