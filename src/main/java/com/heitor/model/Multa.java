package com.heitor.model;

import com.heitor.enumerate.StatusMulta;

import java.util.Date;

public class Multa {
    private Long id_multa;
    private Emprestimo id_emprestimo_multa;
    private float valor_multa;
    private StatusMulta status_multa;
    private Date data_geracao_multa;
    private Date data_pagamento_multa;

    public Multa(Long id_multa,
                 Emprestimo id_emprestimo_multa,
                 float valor_multa,
                 StatusMulta status_multa,
                 Date data_geracao_multa,
                 Date data_pagamento_multa) {
        this.id_multa = id_multa;
        this.id_emprestimo_multa = id_emprestimo_multa;
        this.valor_multa = valor_multa;
        this.status_multa = status_multa;
        this.data_geracao_multa = data_geracao_multa;
        this.data_pagamento_multa = data_pagamento_multa;
    }

    public Long getId_multa() {
        return id_multa;
    }

    public void setId_multa(Long id_multa) {
        this.id_multa = id_multa;
    }

    public Emprestimo getId_emprestimo_multa() {
        return id_emprestimo_multa;
    }

    public void setId_emprestimo_multa(Emprestimo id_emprestimo_multa) {
        this.id_emprestimo_multa = id_emprestimo_multa;
    }

    public float getValor_multa() {
        return valor_multa;
    }

    public void setValor_multa(float valor_multa) {
        this.valor_multa = valor_multa;
    }

    public StatusMulta getStatus_multa() {
        return status_multa;
    }

    public void setStatus_multa(StatusMulta status_multa) {
        this.status_multa = status_multa;
    }

    public Date getData_geracao_multa() {
        return data_geracao_multa;
    }

    public void setData_geracao_multa(Date data_geracao_multa) {
        this.data_geracao_multa = data_geracao_multa;
    }

    public Date getData_pagamento_multa() {
        return data_pagamento_multa;
    }

    public void setData_pagamento_multa(Date data_pagamento_multa) {
        this.data_pagamento_multa = data_pagamento_multa;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "id_multa=" + id_multa +
                ", id_emprestimo_multa=" + id_emprestimo_multa +
                ", valor_multa=" + valor_multa +
                ", status_multa=" + status_multa +
                ", data_geracao_multa=" + data_geracao_multa +
                ", data_pagamento_multa=" + data_pagamento_multa +
                '}';
    }
}
