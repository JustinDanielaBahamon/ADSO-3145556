package com.sena.app.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.app.Entity.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {

}