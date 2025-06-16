package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;

@Entity
@Table(name="categories")
public class Categorias {

    @Id //llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_categories")
    private Integer idCategorias;

    @Column (name="category_name")
    private String nombreCategoria;

    @Column (name="icon_path") //snake case
    private String icon_path;// c

    public Integer getIdCategorias() {
        return idCategorias;
    }

    public void setIdCategorias(Integer idCategorias) {
        this.idCategorias = idCategorias;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getIcon_path() {
        return icon_path;
    }

    public void setIcon_path(String icon_path) {
        this.icon_path = icon_path;
    }
}
