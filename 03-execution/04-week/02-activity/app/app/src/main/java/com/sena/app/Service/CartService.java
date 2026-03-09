package com.sena.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sena.app.Entity.Cart;
import com.sena.app.IRepository.CartRepository;

@Service
public class CartService {

    private final CartRepository repository;

    public CartService(CartRepository repository) {
        this.repository = repository;
    }

    public Cart save(Cart cart) {
        return repository.save(cart);
    }

    public List<Cart> All() {
        return repository.findAll();
    }

}