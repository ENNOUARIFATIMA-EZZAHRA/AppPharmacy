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

    //  Get Product by ID
    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable("id") long id) {
        ProductModel product = productService.getProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    // Update Product
    @PutMapping("/{id}")
    public ResponseEntity<ProductModel> updateProduct(
            @PathVariable("id") long id,
            @RequestBody ProductModel product) {
        ProductModel updatedProduct = productService.updateProduct(product, id);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    // Delete Product
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") long id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product deleted successfully.", HttpStatus.OK);
    }
}
