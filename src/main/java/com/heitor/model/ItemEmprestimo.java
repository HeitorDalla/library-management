package com.heitor.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "itemEmprestimo")
public class ItemEmprestimo {

    @Id
    @Column(name = "id")
    private Long id;

    private Emprestimo id_emprestimo_item_emprestimo;

    @Column(name = "data_devolucao_item_emprestimo")
    private Date dataDevolucao;

    public ItemEmprestimo() {}

    public ItemEmprestimo(Long id,
                          Emprestimo id_emprestimo_item_emprestimo,
                          Date dataDevolucao) {
        this.id = id;
        this.id_emprestimo_item_emprestimo = id_emprestimo_item_emprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Emprestimo getId_emprestimo_item_emprestimo() {
        return id_emprestimo_item_emprestimo;
    }

    public void setId_emprestimo_item_emprestimo(Emprestimo id_emprestimo_item_emprestimo) {
        this.id_emprestimo_item_emprestimo = id_emprestimo_item_emprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "ItemEmprestimo{" +
                "id=" + id +
                ", id_emprestimo_item_emprestimo=" + id_emprestimo_item_emprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}