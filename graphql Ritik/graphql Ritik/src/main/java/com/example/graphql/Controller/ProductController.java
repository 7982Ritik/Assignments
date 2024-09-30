package com.example.graphql.Controller;


import com.example.graphql.Entity.Product;
import com.example.graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @QueryMapping
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @QueryMapping
    public List<Product> getProductsByCategory(@Argument String category){
        return service.getProductsByCategory(category);
    }

    @QueryMapping
    public List<Product> getProductByName(@Argument String name){
        return service.getProductByName(name);
    }

    @MutationMapping
    public Product updateStock(@Argument int id,@Argument int quantity)
    {
        return service.updateStock(id,quantity);
    }

}
