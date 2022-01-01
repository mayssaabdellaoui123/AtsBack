package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Produit;

@Repository
public interface ProductRepositoryy  extends JpaRepository<Produit,Long >{

}
