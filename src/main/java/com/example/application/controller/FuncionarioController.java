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

import com.example.application.models.Funcionario;
import com.example.application.services.FuncionarioService;

//creating RestController  
@RestController  
public class FuncionarioController  {  

  //autowired the FuncionarioService class  
  @Autowired  
  FuncionarioService service;  

  //creating a get mapping that retrieves all the funcionarios detail from the database   
  @GetMapping("/funcionario")  
  private List<Funcionario> getAllFuncionarios() {  
    return service.getAllFuncionarios();  
  }  

  //creating a get mapping that retrieves the detail of a specific funcionario  
  @GetMapping("/funcionario/{id}")  
  private Funcionario getFuncionario(@PathVariable("id") int id)   
  {  
    return service.getFuncionarioById(id);  
  }  

  //creating post mapping that post the funcionario detail in the database  
  @PostMapping("/funcionario")  
  private int createFuncionario(@RequestBody Funcionario funcionario)   
  {  
    service.save(funcionario);  
    return funcionario.getId();  
  }  

  @PutMapping("/funcionario/{id}")
  private int updateFuncionario(@RequestBody Funcionario funcionario) {
    
    service.save(funcionario);  
    return funcionario.getId(); 
  }

  //creating a delete mapping that deletes a specific funcionario  
  @DeleteMapping("/funcionario/{id}")  
  private void deleteFuncionario(@PathVariable("id") int id)   
  {  
    service.delete(id);  
  } 

}