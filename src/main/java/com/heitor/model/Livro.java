package com.heitor.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "livro")
public class Livro {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo_livro")
    private String titulo;

    @Column(name = "ano_publicacao_livro")
    private int anoPublicacao;

    @Column(name = "idioma_livro")
    private String idioma;

    private Categoria categoria_livro;

    private Editora editora_livro;

    private List<Autor> autores_livro;

    @Column(name = "data_cadastro_livro")
    private Date dataCadastro;

    public Livro() {}

    public Livro(Long id,
                 String titulo,
                 int anoPublicacao,
                 String idioma,
                 Categoria categoria_livro,
                 Editora editora_livro,
                 List<Autor> autores_livro,
                 Date dataCadastro) {
        this.id = id;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.idioma = idioma;
        this.categoria_livro = categoria_livro;
        this.editora_livro = editora_livro;
        this.autores_livro = autores_livro;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", idioma='" + idioma + '\'' +
                ", categoria_livro=" + categoria_livro +
                ", editora_livro=" + editora_livro +
                ", autores_livro=" + autores_livro +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}