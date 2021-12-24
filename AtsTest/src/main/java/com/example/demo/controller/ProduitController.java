package com.example.demo.controller;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.ProductService;
import com.example.demo.entities.Products;
import com.example.demo.entities.Produit;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping("/api")
public class ProduitController {
	
	@Autowired
	ProductService ps;
	
	@GetMapping("/products")
	public ResponseEntity<List<Produit>> getAllA(){
        List<Produit> produits = ps.getAllProduit();
        return new ResponseEntity<>(produits, HttpStatus.OK);
    }
	
	
	@GetMapping("products/{id}")
    public Produit getProduitByUsername(@PathVariable("id") String id){
        return ps.FindProduitById(Long.valueOf(id));
    }

}
