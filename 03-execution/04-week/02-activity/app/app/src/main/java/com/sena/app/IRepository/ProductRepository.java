package com.sena.app.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.app.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
