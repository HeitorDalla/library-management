package com.heitor.model;

import com.heitor.enumerate.StatusUsuario;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_usuario")
    private String nome;

    @Column(name = "telefone_usuario")
    private String telefone;

    @Column(name = "email_usuario")
    private String email;

    @Column(name = "data_cadastro_usuario")
    private Date dataCadastro;

    private StatusUsuario status;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @OneToMany(mappedBy = "usuario") // apenas uma ligacao para o atributo `usuario` da entidade Emprestimo
    private List<Emprestimo> emprestimos;

    @OneToMany(mappedBy = "usuario")
    private List<Reserva> reservas;

    public Usuario() {}

    public Usuario(Long id,
                   String nome,
                   String telefone,
                   String email,
                   StatusUsuario status,
                   Endereco endereco,
                   Date dataCadastro,
                   List<Emprestimo> emprestimos,
                   List<Reserva> reservas) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.status = status;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.emprestimos = emprestimos;
        this.reservas = reservas;
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

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", endereco=" + endereco +
                ", dataCadastro=" + dataCadastro +
                ", emprestimos=" + emprestimos +
                ", reservas=" + reservas +
                '}';
    }
}