package com.estudos.albumdefigurinhas.request;

import java.io.Serializable;

public class AdicionaTimeRequest implements Serializable {

    private Long timeId;

    public Long getTimeId() {
        return timeId;
    }

    public void setTimeId(Long timeId) {
        this.timeId = timeId;
    }
}
