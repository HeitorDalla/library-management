package com.heitor.model;

import javax.xml.crypto.Data;

public class Autor {
    private Long id_autor;
    private String nome_autor;
    private String nacionalidade_autor;
    private Data data_nascimento_autor;

    public Autor(Long id_autor,
                 String nome_autor,
                 String nacionalidade_autor,
                 Data data_nascimento_autor) {
        this.id_autor = id_autor;
        this.nome_autor = nome_autor;
        this.nacionalidade_autor = nacionalidade_autor;
        this.data_nascimento_autor = data_nascimento_autor;
    }

    public Long getId_autor() {
        return id_autor;
    }

    public void setId_autor(Long id_autor) {
        this.id_autor = id_autor;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getNacionalidade() {
        return nacionalidade_autor;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade_autor = nacionalidade;
    }

    public Data getData_nascimento_autor() {
        return data_nascimento_autor;
    }

    public void setData_nascimento_autor(Data data_nascimento_autor) {
        this.data_nascimento_autor = data_nascimento_autor;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id_autor=" + id_autor +
                ", nome_autor='" + nome_autor + '\'' +
                ", nacionalidade='" + nacionalidade_autor + '\'' +
                ", data_nascimento_autor=" + data_nascimento_autor +
                '}';
    }
}
