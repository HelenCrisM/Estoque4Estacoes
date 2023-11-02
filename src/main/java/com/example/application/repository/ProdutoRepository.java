package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>  
{  
} 