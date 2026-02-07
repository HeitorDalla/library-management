package com.heitor.model;

import jakarta.persistence.*;

// @Embeddable  --  USADO QUANDO QUERO CRIAR UM OBJETO DE VALOR, OU SEJA, NAO TEM IDENTIDADE PROPRIA, NAO VIRA TABELA SEPARADA.
// Usar `Embeddable` quando quero que as colunas de um objeto se `agregem` em uma entidade, nao tendo identidade propria
@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "logradouro_endereco")
    private String logradouro;

    @Column(name = "numero_endereco")
    private String numero;

    @Column(name = "complemento_endereco")
    private String complemento;

    @Column(name = "bairro_endereco")
    private String bairro;

    @Column(name = "cidade_endereco")
    private String cidade;

    @Column(name = "estado_endereco")
    private String estado;

    @Column(name = "cep_endereco")
    private String cep;

    public Endereco() {}

    public Endereco(Long id,
                    String logradouro,
                    String numero,
                    String complemento,
                    String bairro,
                    String cidade,
                    String estado,
                    String cep) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Long getId_endereco() {
        return id;
    }

    public void setId_endereco(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id_endereco=" + id +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}