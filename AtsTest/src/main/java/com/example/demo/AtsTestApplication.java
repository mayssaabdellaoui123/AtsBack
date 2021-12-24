package com.example.demo;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Services.ProductService;
import com.example.demo.entities.Produit;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import antlr.collections.List;

@SpringBootApplication
public class AtsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtsTestApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner runner(ProductService productService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<java.util.List<Produit>> typeReference = new TypeReference<java.util.List<Produit>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("json/test.json");
			try {
				java.util.List<Produit> produits = mapper.readValue(inputStream,typeReference);
				productService.save(produits);
				System.out.println("produits Saved!");
			} catch (IOException e){
				System.out.println("Unable to save produits: " + e.getMessage());
			}
		};
	}

}
