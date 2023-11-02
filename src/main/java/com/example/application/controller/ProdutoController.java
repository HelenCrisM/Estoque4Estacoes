package com.example.application.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.models.Produto;
import com.example.application.services.ProdutoService;

//creating RestController  
@RestController  
public class ProdutoController  {  

  //autowired the ProdutoService class  
  @Autowired  
  ProdutoService service;  

  //creating a get mapping that retrieves all the Produtos detail from the database   
  @GetMapping("/produto")  
  private List<Produto> getAllProdutos() {  
    return service.getAllProdutos();  
  }  

  //creating a get mapping that retrieves the detail of a specific Produto  
  @GetMapping("/produto/{id}")  
  private Produto getProduto(@PathVariable("id") int id)   
  {  
    return service.getProdutoById(id);  
  }  

  //creating post mapping that post the Produto detail in the database  
  @PostMapping("/produto")  
  private int createProduto(@RequestBody Produto produto)   
  {  
    service.save(produto);  
    return produto.getId();  
  }  
  
  @PutMapping("/produto/{id}")
  private int updateProduto(@RequestBody Produto produto) {
    
    service.save(produto);  
    return produto.getId(); 
  }

  //creating a delete mapping that deletes a specific produto  
  @DeleteMapping("/produto/{id}")  
  private void deleteProduto(@PathVariable("id") int id)   
  {  
    service.delete(id);  
  }  

}