package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table (name="productos")
public class Producto {
    @Id //llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_producto")
    private Integer idProducto;

    private String nombre;

    //Llave foranea
    @Column (name="id_categoria")
    private Integer idCategoria;

    @Column (name="ui_color")
    private String UIColor;

    @Column (name="image_path")
    private String imagePath;

   @Column(name = "description") // nombre real en la base de datos
   private String description;   // nombre interno en Java

    @Column (name="precio_venta")
    private Double precioVenta;

    @Column (name="cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @Column (name="id_tienda")
    private Integer idTienda;

    //Inicio de relación con categorias
    @ManyToOne
    @JoinColumn(name="id_categoria", insertable=false, updatable = false) //insertar sin modificar
    private Categorias categoria;

    @ManyToOne
    @JoinColumn(name="id_tienda", insertable=false, updatable = false) //insertar sin modificar
    private Tienda tienda;


    //Getters y setters - Evitar Terminaciones de relaciones
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getUIColor() {
        return UIColor;
    }

    public void setUIColor(String UIColor) {
        this.UIColor = UIColor;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

   public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description;}

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
