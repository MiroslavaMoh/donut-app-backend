package com.tecsoftware.donut_app_backend.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tecsoftware.donut_app_backend.persistence.entity.Producto;

import java.util.Optional;

@Repository
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    Optional<Producto> findByNombre(String nombre);
}
