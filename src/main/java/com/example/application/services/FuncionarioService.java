package com.example.application.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.example.application.models.Funcionario;
import com.example.application.repository.FuncionarioRepository;  

@Service  
public class FuncionarioService { 

    @Autowired  
    FuncionarioRepository repository; 
    
    //getting all funcionario records  
    public List<Funcionario> getAllFuncionarios() {  
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();  
        repository.findAll().forEach(funcionario -> funcionarios.add(funcionario));  
        return funcionarios;  
    }  
    
    //getting a specific record  
    public Funcionario getFuncionarioById(int id) {  
        return repository.findById(id).get();  
    }  

    
    public void save(Funcionario funcionario) {  
        repository.save(funcionario);  
    }  

    

    //deleting a specific record  
    public void delete(int id)   
    {  
        repository.deleteById(id);  
    }  
}  