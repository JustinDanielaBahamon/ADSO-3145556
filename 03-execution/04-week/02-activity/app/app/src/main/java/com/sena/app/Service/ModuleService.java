package com.sena.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sena.app.Entity.Module;
import com.sena.app.IRepository.ModuleRepository;

@Service
public class ModuleService {

    private final ModuleRepository repository;

    public ModuleService(ModuleRepository repository) {
        this.repository = repository;
    }

    public Module save(Module module) {
        return repository.save(module);
    }

    public List<Module> getAll() {
        return repository.findAll();
    }
}