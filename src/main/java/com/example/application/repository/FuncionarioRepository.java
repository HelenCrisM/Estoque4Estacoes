package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.models.Funcionario;  

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>  
{  
} 
