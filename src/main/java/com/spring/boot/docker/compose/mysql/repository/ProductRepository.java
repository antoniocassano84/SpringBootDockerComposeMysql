package com.spring.boot.docker.compose.mysql.repository;

import com.spring.boot.docker.compose.mysql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Integer> {
}
