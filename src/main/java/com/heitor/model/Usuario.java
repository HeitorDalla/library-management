package com.heitor.model;

import com.heitor.enumerate.StatusUsuario;

import java.util.Date;

public class Usuario {
    private Long id_usuario;
    private String nome_usuario;
    private String telefone_usuario;
    private String email_usuario;
    private StatusUsuario status_usuario;
    private Endereco endereco_usuario;
    private Date data_cadastro_usuario;

    public Usuario(Long id_usuario,
                   String nome_usuario,
                   String telefone_usuario,
                   String email_usuario,
                   StatusUsuario status_usuario,
                   Endereco endereco_usuario,
                   Date data_cadastro_usuario) {
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
        this.telefone_usuario = telefone_usuario;
        this.email_usuario = email_usuario;
        this.status_usuario = status_usuario;
        this.endereco_usuario = endereco_usuario;
        this.data_cadastro_usuario = data_cadastro_usuario;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getTelefone_usuario() {
        return telefone_usuario;
    }

    public void setTelefone_usuario(String telefone_usuario) {
        this.telefone_usuario = telefone_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public StatusUsuario getStatus_usuario() {
        return status_usuario;
    }

    public void setStatus_usuario(StatusUsuario status_usuario) {
        this.status_usuario = status_usuario;
    }

    public Endereco getEndereco_usuario() {
        return endereco_usuario;
    }

    public void setEndereco_usuario(Endereco endereco_usuario) {
        this.endereco_usuario = endereco_usuario;
    }

    public Date getData_cadastro_usuario() {
        return data_cadastro_usuario;
    }

    public void setData_cadastro_usuario(Date data_cadastro_usuario) {
        this.data_cadastro_usuario = data_cadastro_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", nome_usuario='" + nome_usuario + '\'' +
                ", telefone_usuario='" + telefone_usuario + '\'' +
                ", email_usuario='" + email_usuario + '\'' +
                ", status_usuario=" + status_usuario +
                ", endereco_usuario=" + endereco_usuario +
                ", data_cadastro_usuario=" + data_cadastro_usuario +
                '}';
    }
}
