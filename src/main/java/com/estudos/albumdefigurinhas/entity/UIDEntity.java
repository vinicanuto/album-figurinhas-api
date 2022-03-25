package com.estudos.albumdefigurinhas.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class UIDEntity extends StandardEntity{

    public UIDEntity() {
    }

    protected String uid;

    protected String uri;

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
