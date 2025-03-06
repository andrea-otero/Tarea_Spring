package com.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cafeteria.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
