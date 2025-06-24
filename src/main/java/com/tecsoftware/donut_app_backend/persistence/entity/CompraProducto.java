package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table (name="compras_productos")
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
    @MapsId("idCompra") // Enlaza con el campo del embeddable
    @JoinColumn(name = "id_compra")
    private Compras compra;

    //final de relacion con producto
    @ManyToOne
    @MapsId("idProducto") // Enlaza con el campo del embeddable
    @JoinColumn(name = "id_producto")
    private Producto producto;

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

    public Compras getCompra() {
        return compra;
    }

    public void setCompra(Compras compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
