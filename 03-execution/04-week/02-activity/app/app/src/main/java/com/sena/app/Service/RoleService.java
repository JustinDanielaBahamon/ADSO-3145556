package com.sena.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sena.app.Entity.Role;
import com.sena.app.IRepository.RoleRepository;

@Service
public class RoleService {

    private final RoleRepository repository;

    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }

    public Role save(Role role) {
        return repository.save(role);
    }

    public List<Role> All() {
        return repository.findAll();
    }

}