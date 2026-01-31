package com.heitor.model;

public class Editora {
    private Long id_editora;
    private String nome_editora;
    private String cnpj_editora;

    public Editora(Long id_editora,
                   String nome_editora,
                   String cnpj_editora) {
        this.id_editora = id_editora;
        this.nome_editora = nome_editora;
        this.cnpj_editora = cnpj_editora;
    }

    public Long getId_editora() {
        return id_editora;
    }

    public void setId_editora(Long id_editora) {
        this.id_editora = id_editora;
    }

    public String getNome_editora() {
        return nome_editora;
    }

    public void setNome_editora(String nome_editora) {
        this.nome_editora = nome_editora;
    }

    public String getCnpj_editora() {
        return cnpj_editora;
    }

    public void setCnpj_editora(String cnpj_editora) {
        this.cnpj_editora = cnpj_editora;
    }

    @Override
    public String toString() {
        return "Editora{" +
                "id_editora=" + id_editora +
                ", nome_editora='" + nome_editora + '\'' +
                ", cnpj_editora='" + cnpj_editora + '\'' +
                '}';
    }
}
