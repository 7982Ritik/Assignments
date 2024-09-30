package com.example.graphql.Repository;

import com.example.graphql.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByCategory(String category);

    List<Product> findByName(String productName);
}
