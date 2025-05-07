package com.devtiro.pharmacy.service.impl;

import com.devtiro.pharmacy.exception.ResourceNotFoundException;
import com.devtiro.pharmacy.model.ProductModel;
import com.devtiro.pharmacy.repository.ProductRepository;
import com.devtiro.pharmacy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public ProductModel saveProduct(ProductModel product) {
		return productRepository.save(product);
	}

	@Override
	public List<ProductModel> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public ProductModel getProductById(long id) {
		return productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
	}

}