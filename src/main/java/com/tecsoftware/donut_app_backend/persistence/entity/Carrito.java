package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="carts")
public class Carrito {

    @Id //llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_cart")
    private Integer idCarrito;

    @Column (name="created_at")
    private LocalDateTime fecha;

    public Integer getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
