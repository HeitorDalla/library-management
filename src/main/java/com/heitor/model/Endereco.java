package com.heitor.model;

public class Endereco {
    private Long id_endereco;
    private String logradouro_endereco;
    private String numero_endereco;
    private String complemento_endereco;
    private String bairro_endereco;
    private String cidade_endereco;
    private String estado_endereco;
    private String cep_endereco;

    public Endereco(Long id_endereco,
                    String logradouro_endereco,
                    String numero_endereco,
                    String complemento_endereco,
                    String bairro_endereco,
                    String cidade_endereco,
                    String estado_endereco,
                    String cep_endereco) {
        this.id_endereco = id_endereco;
        this.logradouro_endereco = logradouro_endereco;
        this.numero_endereco = numero_endereco;
        this.complemento_endereco = complemento_endereco;
        this.bairro_endereco = bairro_endereco;
        this.cidade_endereco = cidade_endereco;
        this.estado_endereco = estado_endereco;
        this.cep_endereco = cep_endereco;
    }

    public Long getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Long id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getLogradouro() {
        return logradouro_endereco;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro_endereco = logradouro;
    }

    public String getNumero_endereco() {
        return numero_endereco;
    }

    public void setNumero_endereco(String numero_endereco) {
        this.numero_endereco = numero_endereco;
    }

    public String getComplemento_endereco() {
        return complemento_endereco;
    }

    public void setComplemento_endereco(String complemento_endereco) {
        this.complemento_endereco = complemento_endereco;
    }

    public String getBairro_endereco() {
        return bairro_endereco;
    }

    public void setBairro_endereco(String bairro_endereco) {
        this.bairro_endereco = bairro_endereco;
    }

    public String getCidade_endereco() {
        return cidade_endereco;
    }

    public void setCidade_endereco(String cidade_endereco) {
        this.cidade_endereco = cidade_endereco;
    }

    public String getEstado_endereco() {
        return estado_endereco;
    }

    public void setEstado_endereco(String estado_endereco) {
        this.estado_endereco = estado_endereco;
    }

    public String getCep_endereco() {
        return cep_endereco;
    }

    public void setCep_endereco(String cep_endereco) {
        this.cep_endereco = cep_endereco;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id_endereco=" + id_endereco +
                ", logradouro='" + logradouro_endereco + '\'' +
                ", numero_endereco='" + numero_endereco + '\'' +
                ", complemento_endereco='" + complemento_endereco + '\'' +
                ", bairro_endereco='" + bairro_endereco + '\'' +
                ", cidade_endereco='" + cidade_endereco + '\'' +
                ", estado_endereco='" + estado_endereco + '\'' +
                ", cep_endereco='" + cep_endereco + '\'' +
                '}';
    }
}
