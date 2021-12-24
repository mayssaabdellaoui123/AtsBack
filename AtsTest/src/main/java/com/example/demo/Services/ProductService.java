package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Produit;
import com.example.demo.repository.ProductRepositoryy;

@Service
public class ProductService {

	 private ProductRepositoryy productRepository;

	   

	    public Iterable<Produit> list() {
	        return productRepository.findAll();
	    }

	    public Produit save(Produit user) {
	        return productRepository.save(user);
	    }

	    public void save(List<Produit> users) {
	    	productRepository.saveAll(users);
	    }
	    
	    public Produit FindProduitById (long id) {
	    	return productRepository.findById(id).orElse(new Produit());
	    }
	    
	    public List<Produit> getAllProduit() {
	    	return (List<Produit>) productRepository.findAll();
	    }
	    
	    }
