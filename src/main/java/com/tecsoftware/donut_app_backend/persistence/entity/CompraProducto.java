package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table (name="compras_productos)")
public class CompraProducto {

    //ID de CompraProductosPK
    @EmbeddedId
    private CompraProductosPK id;

    private Integer cantidad;

    private Double total;

    private Boolean estado;

    //Llave compuesta
    //Final de relación con compra
    @ManyToOne
    @JoinColumn(name="id_compra")
    private Compras compra;

    //final de relacion con producto
    @ManyToOne
    @JoinColumn(name="id_producto")
    private Producto productos;

    //Getters y setters - Evitar Terminaciones de relaciones

    public CompraProductosPK getId() {
        return id;
    }

    public void setId(CompraProductosPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
