package com.estudos.albumdefigurinhas.request;

import com.estudos.albumdefigurinhas.entity.Time;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Calendar;

public class TimeRequest implements Serializable {

    private String nome;

    private String apelido;

    @Temporal(TemporalType.DATE)
    private Calendar dataFundacao;

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

    public Time converteParaTime(){
        Time time = new Time();
        time.setNome(this.nome);
        time.setApelido(this.apelido);
        time.setDataFundacao(this.dataFundacao);
        return time;
    }
}
