package com.heitor.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_autor")
    private String nome;

    @Column(name = "nacionalidade_autor")
    private String nacionalidade;

    @Column(name = "data_nascimento_autor")
    private Date dataNascimento;

    public Autor() {}

    public Autor(Long id,
                 String nome,
                 String nacionalidade,
                 Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Date getData_nascimento() {
        return dataNascimento;
    }

    public void setData_nascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", data_nascimento=" + dataNascimento +
                '}';
    }
}