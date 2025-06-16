package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;

@Entity
@Table(name="cart_items")
public class CartItems {

    @Id //llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_cart_items")
    private Integer idCartItems;

    @Column (name="cart_id")
    private Integer cartId;

    @Column (name="product_id")
    private Integer productId;

    @Column (name="item_quantity")
    private Integer itemQuantity;

    public Integer getIdCartItems() {
        return idCartItems;
    }

    public void setIdCartItems(Integer idCartItems) {
        this.idCartItems = idCartItems;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
