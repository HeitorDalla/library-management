package com.heitor.model;

import java.util.Date;

public class ItemEmprestimo {
    private Long id_item_emprestimo;
    private Emprestimo id_emprestimo_item_emprestimo;
    private Date data_devolucao_item_emprestimo;

    public ItemEmprestimo(Long id_item_emprestimo,
                          Emprestimo id_emprestimo_item_emprestimo,
                          Date data_devolucao_item_emprestimo) {
        this.id_item_emprestimo = id_item_emprestimo;
        this.id_emprestimo_item_emprestimo = id_emprestimo_item_emprestimo;
        this.data_devolucao_item_emprestimo = data_devolucao_item_emprestimo;
    }

    public Long getId_item_emprestimo() {
        return id_item_emprestimo;
    }

    public void setId_item_emprestimo(Long id_item_emprestimo) {
        this.id_item_emprestimo = id_item_emprestimo;
    }

    public Emprestimo getId_emprestimo_item_emprestimo() {
        return id_emprestimo_item_emprestimo;
    }

    public void setId_emprestimo_item_emprestimo(Emprestimo id_emprestimo_item_emprestimo) {
        this.id_emprestimo_item_emprestimo = id_emprestimo_item_emprestimo;
    }

    public Date getData_devolucao_item_emprestimo() {
        return data_devolucao_item_emprestimo;
    }

    public void setData_devolucao_item_emprestimo(Date data_devolucao_item_emprestimo) {
        this.data_devolucao_item_emprestimo = data_devolucao_item_emprestimo;
    }

    @Override
    public String toString() {
        return "ItemEmprestimo{" +
                "id_item_emprestimo=" + id_item_emprestimo +
                ", id_emprestimo_item_emprestimo=" + id_emprestimo_item_emprestimo +
                ", data_devolucao_item_emprestimo=" + data_devolucao_item_emprestimo +
                '}';
    }
}
