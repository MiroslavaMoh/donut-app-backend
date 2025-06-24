package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table (name="tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tienda")
    private String idTienda;

    private String nombre;



    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
