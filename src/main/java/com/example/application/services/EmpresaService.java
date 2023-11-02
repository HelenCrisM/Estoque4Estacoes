package com.example.application.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.example.application.models.Empresa;
import com.example.application.repository.EmpresaRepository;  

@Service  
public class EmpresaService { 

    @Autowired  
    EmpresaRepository repository; 
    
    //getting all Empresa records  
    public List<Empresa> getAllEmpresas() {  
        List<Empresa> empresas = new ArrayList<Empresa>();  
        repository.findAll().forEach(empresa -> empresas.add(empresa));  
        return empresas;  
    }  
    
    //getting a specific record  
    public Empresa getEmpresaById(int id) {  
        return repository.findById(id).get();  
    }  

    
    public void save(Empresa empresa) {  
        repository.save(empresa);  
    }  

    //deleting a specific record  
    public void delete(int id)   
    {  
        repository.deleteById(id);  
    }  
}  