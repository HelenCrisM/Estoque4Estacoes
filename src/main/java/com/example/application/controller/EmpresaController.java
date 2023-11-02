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

import com.example.application.models.Empresa;
import com.example.application.services.EmpresaService;

//creating RestController  
@RestController  
public class EmpresaController  {  

  //autowired the EmpresaService class  
  @Autowired  
  EmpresaService service;  

  //creating a get mapping that retrieves all the empresas detail from the database   
  @GetMapping("/empresa")  
  private List<Empresa> getAllEmpresas() {  
    return service.getAllEmpresas();  
  }  

  //creating a get mapping that retrieves the detail of a specific Empresa  
  @GetMapping("/empresa/{id}")  
  private Empresa getEmpresa(@PathVariable("id") int id)   
  {  
    return service.getEmpresaById(id);  
  }  

  //creating post mapping that post the Empresa detail in the database  
  @PostMapping("/empresa")  
  private int createEmpresa(@RequestBody Empresa empresa)   
  {  
    service.save(empresa);  
    return empresa.getId();  
  }  
  
  @PutMapping("/empresa/{id}")
  private int updateEmpresa(@RequestBody Empresa empresa) {
    
    service.save(empresa);  
    return empresa.getId(); 
  }

  //creating a delete mapping that deletes a specific Empresa  
  @DeleteMapping("/empresa/{id}")  
  private void deleteEmpresa(@PathVariable("id") int id)   
  {  
    service.delete(id);  
  }  

}