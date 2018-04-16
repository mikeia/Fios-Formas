package com.example.mikeias.fiosformas.model;

/**
 * Created by Mikeias on 09/03/2018.
 */

public class Clientes {
    private String nome;
    private String fone;
    private String hora;
    private String situacao;
    private int foto;

    public Clientes() {

    }

    public Clientes(String nome, String fone, String hora,String situacao, int foto) {
        this.nome     = nome;
        this.fone     = fone;
        this.hora     = hora;
        this.situacao = situacao;
        this.foto     = foto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getHora() {
        return hora;
    }

    public int getFoto() {
        return foto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
