package com.devtiro.pharmacy.service;

import java.util.List;
import com.devtiro.pharmacy.model.ProductModel;

public interface ProductService {

    ProductModel saveProduct(ProductModel product);

    List<ProductModel> getAllProducts();

    ProductModel getProductById(long id);

    ProductModel updateProduct(ProductModel product, long id);

    void deleteProduct(long id);
}
