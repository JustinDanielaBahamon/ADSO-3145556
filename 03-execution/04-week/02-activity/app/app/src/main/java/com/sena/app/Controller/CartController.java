package com.sena.app.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.Cart;
import com.sena.app.Service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Cart> create(@RequestBody Cart cart) {
        Cart savedCart = service.save(cart);
        return new ResponseEntity<>(savedCart, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Cart>> All() {
        List<Cart> carts = service.All();
        return new ResponseEntity<>(carts, HttpStatus.OK);
    }

}
