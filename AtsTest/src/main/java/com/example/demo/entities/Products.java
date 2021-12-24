package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

public class Products implements Serializable {
	
	List<Produit> products ;

	public List<Produit> getProducts() {
		return products;
	}

	public void setProducts(List<Produit> products) {
		this.products = products;
	} 
	
	

}
