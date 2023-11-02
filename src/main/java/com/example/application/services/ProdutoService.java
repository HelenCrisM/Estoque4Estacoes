package com.example.application.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.example.application.models.Produto;
import com.example.application.repository.ProdutoRepository;  

@Service  
public class ProdutoService { 

    @Autowired  
    ProdutoRepository repository; 
    
    //getting all Produto records  
    public List<Produto> getAllProdutos() {  
        List<Produto> produtos = new ArrayList<Produto>();  
        repository.findAll().forEach(produto -> produtos.add(produto));  
        return produtos;  
    }  
    
    //getting a specific record  
    public Produto getProdutoById(int id) {  
        return repository.findById(id).get();  
    }  

    
    public void save(Produto produto) {  
        repository.save(produto);  
    }  

    //deleting a specific record  
    public void delete(int id)   
    {  
        repository.deleteById(id);  
    }  
}  