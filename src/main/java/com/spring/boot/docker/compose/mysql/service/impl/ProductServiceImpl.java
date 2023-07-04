package com.spring.boot.docker.compose.mysql.service.impl;

import com.spring.boot.docker.compose.mysql.entity.Product;
import com.spring.boot.docker.compose.mysql.repository.ProductRepository;
import com.spring.boot.docker.compose.mysql.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
