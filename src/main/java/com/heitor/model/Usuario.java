package com.heitor.model;

import com.heitor.enumerate.StatusUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_usuario")
    private String nome;

    @Column(name = "telefone_usuario")
    private String telefone;

    @Column(name = "email_usuario")
    private String email;

    private StatusUsuario status;

    private Endereco endereco;

    @Column(name = "data_cadastro")
    private Date dataCadastro;

    public Usuario() {}

    public Usuario(Long id,
                   String nome,
                   String telefone,
                   String email,
                   StatusUsuario status,
                   Endereco endereco,
                   Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.status = status;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", talefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", endereco=" + endereco +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}