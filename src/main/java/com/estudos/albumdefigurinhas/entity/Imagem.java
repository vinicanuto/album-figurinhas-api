package com.estudos.albumdefigurinhas.entity;

import java.io.Serializable;

public class Imagem implements Serializable {

    private String uid;

    private String uri;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
