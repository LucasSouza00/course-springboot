package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Product;

// Repository responsável por fazer operações com a entidade Product
public interface ProductRepository extends JpaRepository<Product, Long>{

}
