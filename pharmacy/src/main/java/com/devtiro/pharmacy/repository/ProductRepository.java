package com.devtiro.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devtiro.pharmacy.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
