package com.tecsoftware.donut_app_backend.web.controller;

import com.tecsoftware.donut_app_backend.persistence.crud.ProductoCrudRepository;
import com.tecsoftware.donut_app_backend.persistence.entity.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoCrudRepository productoCrudRepository;

    public ProductoController(ProductoCrudRepository productoCrudRepository) {
        this.productoCrudRepository = productoCrudRepository;
    }

    @GetMapping
    public Iterable<Producto> getAllProductos() {
        return productoCrudRepository.findAll(); // puedes probar con GET en Postman
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Producto> getProductoByNombre(@PathVariable String nombre) {
        return productoCrudRepository.findByNombre(nombre)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
