package com.example.graphql.service;

import com.example.graphql.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    List<Product>  getProductsByCategory(String category);
    List<Product> getProductByName(String productName);
    Product updateStock(int id,int quantity);
}
