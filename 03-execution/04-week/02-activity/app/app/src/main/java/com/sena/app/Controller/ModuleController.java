package com.sena.app.Controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Asegúrate de importar TU clase Module y no la de Java interna
import com.sena.app.Entity.Module; 
import com.sena.app.Service.ModuleService;

@RestController
@RequestMapping("/api/module")
public class ModuleController {

    private final ModuleService service;

    public ModuleController(ModuleService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Module> create(@RequestBody Module module) {
        Module savedModule = service.save(module);
        return new ResponseEntity<>(savedModule, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Module>> getAll() { 
        List<Module> modules = service.getAll(); 
        return new ResponseEntity<>(modules, HttpStatus.OK);
    }
}