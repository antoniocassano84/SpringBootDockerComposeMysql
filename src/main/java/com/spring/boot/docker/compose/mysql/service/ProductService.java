package com.spring.boot.docker.compose.mysql.service;

import com.spring.boot.docker.compose.mysql.entity.Product;

import java.util.List;

public interface ProductService {

    Product insertProduct(Product product);
    List<Product> getProducts();
}
