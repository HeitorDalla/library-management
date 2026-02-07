package com.heitor.model;

import com.heitor.enumerate.StatusReserva;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @Column(name = "id")
    private Long id;

    private Usuario id_usuario_reserva;

    private Livro id_livro_reserva;

    @Column(name = "data_reserva")
    private Date data;

    private StatusReserva statusReserva;

    public Reserva() {}

    public Reserva(Long id,
                   Usuario id_usuario_reserva,
                   Livro id_livro_reserva,
                   Date data,
                   StatusReserva statusReserva) {
        this.id = id;
        this.id_usuario_reserva = id_usuario_reserva;
        this.id_livro_reserva = id_livro_reserva;
        this.data = data;
        this.statusReserva = statusReserva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getId_usuario_reserva() {
        return id_usuario_reserva;
    }

    public void setId_usuario_reserva(Usuario id_usuario_reserva) {
        this.id_usuario_reserva = id_usuario_reserva;
    }

    public Livro getId_livro_reserva() {
        return id_livro_reserva;
    }

    public void setId_livro_reserva(Livro id_livro_reserva) {
        this.id_livro_reserva = id_livro_reserva;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusReserva getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(StatusReserva statusReserva) {
        this.statusReserva = statusReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", id_usuario_reserva=" + id_usuario_reserva +
                ", id_livro_reserva=" + id_livro_reserva +
                ", data=" + data +
                ", statusReserva=" + statusReserva +
                '}';
    }
}