package com.tecsoftware.donut_app_backend.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompraProductosPK implements Serializable {

    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;

    // Constructor vacío obligatorio
    public CompraProductosPK() {}

    //  Constructor con todos los campos (opcional pero útil)
    public CompraProductosPK(Integer idCompra, Integer idProducto) {
        this.idCompra = idCompra;
        this.idProducto = idProducto;
    }

    //  Getters y setters necesarios para Hibernate
    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    // equals() y hashCode() para comparar correctamente la clave compuesta
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompraProductosPK)) return false;
        CompraProductosPK that = (CompraProductosPK) o;
        return Objects.equals(idCompra, that.idCompra) &&
                Objects.equals(idProducto, that.idProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCompra, idProducto);
    }
}

