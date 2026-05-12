package com.projectinventory.veggtables.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.projectinventory.veggtables.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	

}
