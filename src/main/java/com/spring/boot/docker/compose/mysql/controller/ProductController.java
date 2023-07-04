package com.spring.boot.docker.compose.mysql.controller;

import com.spring.boot.docker.compose.mysql.entity.Product;
import com.spring.boot.docker.compose.mysql.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

 private final ProductService productService;

 public ProductController(ProductService productService) {
  this.productService = productService;
 }

 @GetMapping("/findAll")
  public List<Product> getAllProducts() {
   return productService.getProducts();
  }

 @PostMapping("/insert")
 public Product insert(@RequestBody Product product) {
  return productService.insertProduct(product);
 }

}
