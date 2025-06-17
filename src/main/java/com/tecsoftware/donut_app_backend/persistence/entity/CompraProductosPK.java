package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;

@Embeddable
public class CompraProductosPK {
    //llave compuesta para CompraProducto
    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name="id_producto")
    private Integer idProducto;

    //Getters y setters - Evitar Terminaciones de relaciones
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
}
