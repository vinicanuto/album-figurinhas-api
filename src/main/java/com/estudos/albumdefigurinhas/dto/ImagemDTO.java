package com.estudos.albumdefigurinhas.dto;

import com.estudos.albumdefigurinhas.entity.Imagem;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImagemDTO implements Serializable {

    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    private String uri;

    public ImagemDTO toDTO (Imagem imagem){
        this.uuid =imagem.getUid();
        this.uri =imagem.getUri();
        return this;
    }

    public ImagemDTO() {
    }
}
