package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;

@Entity
@Table(name="products")  //IGUAL QUE EN PGADMIN
public class Productos {

    @Id //llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //valor unico autoincrementable
    @Column (name="id_products") // esta linea contiene referencia al atributo original IGUAL QUE EN PGADMIN
    private Integer idProducto; //Aqui esta el nombre cambiado que se utilizara en Java

    @Column (name="product_name") //snake case
    private String nombreProducto;// camel case

    @Column (name="product_price")
    private double productoPrecio;

    @Column (name="ui_color")
    private String UIColor;

    @Column (name="image_path")
    private String imagePath;

    @Column (name="category_id")
    private Integer categoryId;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getProductoPrecio() {
        return productoPrecio;
    }

    public void setProductoPrecio(double productoPrecio) {
        this.productoPrecio = productoPrecio;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
