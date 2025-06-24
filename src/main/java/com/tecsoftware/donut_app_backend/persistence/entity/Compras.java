package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name="compras")
public class Compras {
    //llave primeria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //llave forenea
    @Column (name="id_compra")
    private Integer idCompra;

    //llave forenea
    @Column (name="id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column (name="medio_pago")
    private String medioPago;

    private String comentario;

    private Boolean estado;

    //Inicio relacion con clientes
    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable=false, updatable=false)
    private Clientes cliente;

    @OneToMany(mappedBy = "compra") // debe coincidir con nombre en CompraProducto
    private List<CompraProducto> productos;

    //Getters y setters - Evitar Terminaciones de relaciones
    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
}
