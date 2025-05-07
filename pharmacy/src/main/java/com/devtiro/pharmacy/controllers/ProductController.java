package com.devtiro.pharmacy.controllers;

import com.devtiro.pharmacy.model.ProductModel;
import com.devtiro.pharmacy.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Create Product
    @PostMapping
    public ResponseEntity<ProductModel> saveProduct(@RequestBody ProductModel product) {
        ProductModel savedProduct = productService.saveProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    // Get All Products
    @GetMapping
    public List<ProductModel> getAllProducts() {
        return productService.getAllProducts();
    }

}
