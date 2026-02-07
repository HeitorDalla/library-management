package com.heitor.model;

import com.heitor.enumerate.StatusMulta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "multa")
public class Multa {

    @Id
    @Column(name = "id")
    private Long id;

    private Emprestimo id_emprestimo_multa;

    @Column(name = "valor_multa")
    private float valor;

    private StatusMulta status;

    @Column(name = "data_geracao_multa")
    private Date dataGeracao;

    @Column(name = "data_pagamento_multa")
    private Date dataPagamento;

    public Multa() {}

    public Multa(Long id,
                 Emprestimo id_emprestimo_multa,
                 float valor,
                 StatusMulta status,
                 Date dataGeracao,
                 Date dataPagamento) {
        this.id = id;
        this.id_emprestimo_multa = id_emprestimo_multa;
        this.valor = valor;
        this.status = status;
        this.dataGeracao = dataGeracao;
        this.dataPagamento = dataPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Emprestimo getId_emprestimo_multa() {
        return id_emprestimo_multa;
    }

    public void setId_emprestimo_multa(Emprestimo id_emprestimo_multa) {
        this.id_emprestimo_multa = id_emprestimo_multa;
    }

    public float getValorMulta() {
        return valor;
    }

    public void setValorMulta(float valor) {
        this.valor = valor;
    }

    public StatusMulta getStatus() {
        return status;
    }

    public void setStatus(StatusMulta status) {
        this.status = status;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "id=" + id +
                ", id_emprestimo_multa=" + id_emprestimo_multa +
                ", valorMulta=" + valor +
                ", status=" + status +
                ", dataGeracao=" + dataGeracao +
                ", dataPagamento=" + dataPagamento +
                '}';
    }
}