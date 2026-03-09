package com.sena.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sena.app.Entity.Product;
import com.sena.app.IRepository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public List<Product> All() {
        return repository.findAll();
    }

}