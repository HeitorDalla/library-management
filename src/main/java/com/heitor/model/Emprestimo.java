package com.heitor.model;

import com.heitor.enumerate.StatusEmprestimo;
import jakarta.persistence.*;

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

    @Transient // anotacao para fazer o JPA ignorar a persistencia no banco de dados, mas util para regras de negoico
    private long diasAtraso;

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

    public void setDiasAtraso(long diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public long getDiasAtraso () {
        if (dataDevolucao == null) return 0; // verifica se nao entregou o emprestimo
        return 1; // fazer logica de retorno
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