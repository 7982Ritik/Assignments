package com.example.graphql.service;

import com.example.graphql.Entity.Product;
import com.example.graphql.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements  ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public List<Product> getProductsByCategory(String category){
        return repository.findByCategory(category);
    }

    @Override
    public List<Product> getProductByName(String productName) {
        return repository.findByName(productName);
    }

    @Override
    public Product updateStock(int id, int quantity) {
        Product existingProduct= repository.findById(id).orElseThrow(()->new RuntimeException("product not found"));
        existingProduct.setStock(quantity);
        return repository.save(existingProduct);
    }
}
