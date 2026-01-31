package com.heitor.model;

import com.heitor.enumerate.StatusEmprestimo;

import java.util.Date;

public class Emprestimo {
    private Long id_emprestimo;
    private Usuario id_usuario_emprestimo;
    private Date data_emprestimo;
    private Date data_devolucao_emprestimo;
    private StatusEmprestimo status_emprestimo;

    public Emprestimo(Long id_emprestimo,
                      Usuario id_usuario_emprestimo,
                      Date data_emprestimo,
                      Date data_devolucao_emprestimo,
                      StatusEmprestimo status_emprestimo) {
        this.id_emprestimo = id_emprestimo;
        this.id_usuario_emprestimo = id_usuario_emprestimo;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao_emprestimo = data_devolucao_emprestimo;
        this.status_emprestimo = status_emprestimo;
    }

    public Long getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(Long id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public Usuario getId_usuario_emprestimo() {
        return id_usuario_emprestimo;
    }

    public void setId_usuario_emprestimo(Usuario id_usuario_emprestimo) {
        this.id_usuario_emprestimo = id_usuario_emprestimo;
    }

    public Date getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(Date data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public Date getData_devolucao_emprestimo() {
        return data_devolucao_emprestimo;
    }

    public void setData_devolucao_emprestimo(Date data_devolucao_emprestimo) {
        this.data_devolucao_emprestimo = data_devolucao_emprestimo;
    }

    public StatusEmprestimo getStatus_emprestimo() {
        return status_emprestimo;
    }

    public void setStatus_emprestimo(StatusEmprestimo status_emprestimo) {
        this.status_emprestimo = status_emprestimo;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id_emprestimo=" + id_emprestimo +
                ", id_usuario_emprestimo=" + id_usuario_emprestimo +
                ", data_emprestimo=" + data_emprestimo +
                ", data_devolucao_emprestimo=" + data_devolucao_emprestimo +
                ", status_emprestimo=" + status_emprestimo +
                '}';
    }
}
