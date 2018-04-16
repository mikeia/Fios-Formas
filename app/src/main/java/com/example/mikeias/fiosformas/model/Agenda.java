package com.example.mikeias.fiosformas.model;

/**
 * Created by Mikeias on 15/04/2018.
 */

public class Agenda {
    private String nomeAgenda,foneAgenda,planoAgenda,dataAgenda,horaAgenda,situacaoAgenda;

    public Agenda(){

    }

    public Agenda(String nomeAgenda,String foneAgenda, String planoAgenda,String dataAgenda,String horaAgenda,String situacaoAgenda){
        this.nomeAgenda     = nomeAgenda;
        this.foneAgenda     = foneAgenda;
        this.planoAgenda    = planoAgenda;
        this.dataAgenda     = dataAgenda;
        this.horaAgenda     = horaAgenda;
        this.situacaoAgenda = situacaoAgenda;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public String getFoneAgenda() {
        return foneAgenda;
    }

    public void setFoneAgenda(String foneAgenda) {
        this.foneAgenda = foneAgenda;
    }

    public String getPlanoAgenda() {
        return planoAgenda;
    }

    public void setPlanoAgenda(String planoAgenda) {
        this.planoAgenda = planoAgenda;
    }

    public String getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(String dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    public String getHoraAgenda() {
        return horaAgenda;
    }

    public void setHoraAgenda(String horaAgenda) {
        this.horaAgenda = horaAgenda;
    }

    public String getSituacaoAgenda() {
        return situacaoAgenda;
    }

    public void setSituacaoAgenda(String situacaoAgenda) {
        this.situacaoAgenda = situacaoAgenda;
    }
}
