package com.heitor.model;

import java.util.Date;
import java.util.List;

public class Livro {
    private Long id_livro;
    private String titulo_livro;
    private int anoPublicacao_livro;
    private String idioma_livro;
    private Categoria categoria_livro;
    private Editora editora_livro;
    private List<Autor> autores_livro;
    private Date dataCadastro_livro;

    public Livro(Long id_livro,
                 String titulo_livro,
                 int anoPublicacao_livro,
                 String idioma_livro,
                 Categoria categoria_livro,
                 Editora editora_livro,
                 List<Autor> autores_livro,
                 Date dataCadastro_livro) {
        this.id_livro = id_livro;
        this.titulo_livro = titulo_livro;
        this.anoPublicacao_livro = anoPublicacao_livro;
        this.idioma_livro = idioma_livro;
        this.categoria_livro = categoria_livro;
        this.editora_livro = editora_livro;
        this.autores_livro = autores_livro;
        this.dataCadastro_livro = dataCadastro_livro;
    }

    public Long getId_livro() {
        return id_livro;
    }

    public void setId_livro(Long id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo_livro() {
        return titulo_livro;
    }

    public void setTitulo_livro(String titulo_livro) {
        this.titulo_livro = titulo_livro;
    }

    public int getAnoPublicacao_livro() {
        return anoPublicacao_livro;
    }

    public void setAnoPublicacao_livro(int anoPublicacao_livro) {
        this.anoPublicacao_livro = anoPublicacao_livro;
    }

    public String getIdioma_livro() {
        return idioma_livro;
    }

    public void setIdioma_livro(String idioma_livro) {
        this.idioma_livro = idioma_livro;
    }

    public Categoria getCategoria_livro() {
        return categoria_livro;
    }

    public void setCategoria_livro(Categoria categoria_livro) {
        this.categoria_livro = categoria_livro;
    }

    public Editora getEditora_livro() {
        return editora_livro;
    }

    public void setEditora_livro(Editora editora_livro) {
        this.editora_livro = editora_livro;
    }

    public List<Autor> getAutores_livro() {
        return autores_livro;
    }

    public void setAutores_livro(List<Autor> autores_livro) {
        this.autores_livro = autores_livro;
    }

    public Date getDataCadastro_livro() {
        return dataCadastro_livro;
    }

    public void setDataCadastro_livro(Date dataCadastro_livro) {
        this.dataCadastro_livro = dataCadastro_livro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id_livro=" + id_livro +
                ", titulo_livro='" + titulo_livro + '\'' +
                ", anoPublicacao_livro=" + anoPublicacao_livro +
                ", idioma_livro='" + idioma_livro + '\'' +
                ", categoria_livro=" + categoria_livro +
                ", editora_livro=" + editora_livro +
                ", autores_livro=" + autores_livro +
                ", dataCadastro_livro=" + dataCadastro_livro +
                '}';
    }
}