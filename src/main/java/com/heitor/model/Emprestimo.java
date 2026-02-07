package com.heitor.model;

import com.heitor.enumerate.StatusEmprestimo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {

    @Id
    @Column(name = "id")
    private Long id;

    private Usuario id_usuario_emprestimo;

    @Column(name = "data_emprestimo")
    private Date dataEmprestimo;

    @Column(name = "data_devolucao_emprestimo")
    private Date dataDevolucao;

    private StatusEmprestimo statusEmprestimo;

    public Emprestimo() {}

    public Emprestimo(Long id,
                      Usuario id_usuario_emprestimo,
                      Date dataEmprestimo,
                      Date dataDevolucao,
                      StatusEmprestimo statusEmprestimo) {
        this.id = id;
        this.id_usuario_emprestimo = id_usuario_emprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.statusEmprestimo = statusEmprestimo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getId_usuario_emprestimo() {
        return id_usuario_emprestimo;
    }

    public void setId_usuario_emprestimo(Usuario id_usuario_emprestimo) {
        this.id_usuario_emprestimo = id_usuario_emprestimo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public StatusEmprestimo getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(StatusEmprestimo statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", id_usuario_emprestimo=" + id_usuario_emprestimo +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", statusEmprestimo=" + statusEmprestimo +
                '}';
    }
}