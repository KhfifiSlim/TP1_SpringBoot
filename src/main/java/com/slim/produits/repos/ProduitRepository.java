package com.slim.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slim.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
