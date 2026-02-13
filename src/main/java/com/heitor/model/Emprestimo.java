package com.heitor.model;

import com.heitor.enumerate.StatusEmprestimo;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "data_emprestimo")
    private LocalDate dataEmprestimo;

    @Column(name = "data_devolucao_emprestimo")
    private LocalDate dataDevolucao;

    @Transient // anotacao para fazer o JPA ignorar a persistencia no banco de dados, mas util para regras de negoico
    private long diasAtraso;

    private StatusEmprestimo statusEmprestimo;

    @OneToMany(mappedBy = "emprestimo")
    private List<ItemEmprestimo> itemEmprestimo;

    public Emprestimo() {}

    public Emprestimo(Long id,
                      Usuario usuario,
                      LocalDate dataEmprestimo,
                      LocalDate dataDevolucao,
                      long diasAtraso,
                      StatusEmprestimo statusEmprestimo,
                      List<ItemEmprestimo> itemEmprestimo) {
        this.id = id;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.diasAtraso = diasAtraso;
        this.statusEmprestimo = statusEmprestimo;
        this.itemEmprestimo = itemEmprestimo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public long getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(long diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public StatusEmprestimo getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(StatusEmprestimo statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

    public List<ItemEmprestimo> getItemEmprestimo() {
        return itemEmprestimo;
    }

    public void setItemEmprestimo(List<ItemEmprestimo> itemEmprestimo) {
        this.itemEmprestimo = itemEmprestimo;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", diasAtraso=" + diasAtraso +
                ", statusEmprestimo=" + statusEmprestimo +
                ", itemEmprestimo=" + itemEmprestimo +
                '}';
    }
}