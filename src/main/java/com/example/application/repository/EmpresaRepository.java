package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer>  
{  
} 