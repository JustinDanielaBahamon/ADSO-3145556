package com.sena.app.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.app.Entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

}
