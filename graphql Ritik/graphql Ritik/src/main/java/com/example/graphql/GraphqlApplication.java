package com.example.graphql;

import com.example.graphql.Entity.Product;
import com.example.graphql.Repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class GraphqlApplication {

	@Autowired
	private ProductRepository repository;

//	@PostConstruct
//	public void initDB()
//	{
//		List<Product> products= Stream.of(
//				new Product("Laptop","Electorics",74.99f,50),
//		new Product("Watch","Electorics",70.99f,50),
//		new Product("Car","Electorics",500.99f,5),
//				new Product("KeyChain","TinyUse",5.99f,59)
//		).collect(Collectors.toList());
//		repository.saveAll(products);
//	}

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

}
