package com.heitor.model;

import com.heitor.enumerate.StatusReserva;

import javax.xml.crypto.Data;

public class Reserva {
    private Long id_reserva;
    private Usuario id_usuario_reserva;
    private Livro id_livro_reserva;
    private Data data_reserva;
    private StatusReserva status_reserva;

    public Reserva(Long id_reserva,
                   Usuario id_usuario_reserva,
                   Livro id_livro_reserva,
                   Data data_reserva,
                   StatusReserva status_reserva) {
        this.id_reserva = id_reserva;
        this.id_usuario_reserva = id_usuario_reserva;
        this.id_livro_reserva = id_livro_reserva;
        this.data_reserva = data_reserva;
        this.status_reserva = status_reserva;
    }

    public Long getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(Long id_reserva) {
        this.id_reserva = id_reserva;
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

    public Data getData_reserva() {
        return data_reserva;
    }

    public void setData_reserva(Data data_reserva) {
        this.data_reserva = data_reserva;
    }

    public StatusReserva getStatus_reserva() {
        return status_reserva;
    }

    public void setStatus_reserva(StatusReserva status_reserva) {
        this.status_reserva = status_reserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id_reserva=" + id_reserva +
                ", id_usuario_reserva=" + id_usuario_reserva +
                ", id_livro_reserva=" + id_livro_reserva +
                ", data_reserva=" + data_reserva +
                ", status_reserva=" + status_reserva +
                '}';
    }
}
