package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table (name="categorias")
public class Categorias {
    //Llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Integer idCategoria;

    private Integer description;

    private Boolean estado;

    //Terminación de relación - vista productos
    @OneToMany (mappedBy= "Categoria")
    private List<Producto> productos;

    //Getters y setters - Evitar Terminaciones de relaciones

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
