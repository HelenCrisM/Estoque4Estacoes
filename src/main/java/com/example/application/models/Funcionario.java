package com.example.application.models;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity  //mark class as an Entity   
@Table //defining class name as Table name  
public class Funcionario  {  

  @Id   //mark id as primary key  
  @Column(name="id")  //defining id as column name 
  private int id; 

  @Column(name="nome")
  private String nome;  

  @Column(name="numero_telefone")
  private String numeroTelefone;   

  @Column(name="email")
  private String email; 
  
  @Column(name="senha")
  private String senha;

  @Column(name="funcao_funcionario")
  private String funcaoFuncionario;

  public int getId()   
  {  
    return id;  
  }  

  public void setId(int id)   
  {  
    this.id = id;  
  }  

  public String getNome()   
  {  
    return nome;  
  }  

  public void setNome(String nome)   
  {  
    this.nome = nome;  
  }  

  public String getNumeroTelefone() {
    return numeroTelefone;
  }

  public void setNumeroTelefone(String numeroTelefone) {
      this.numeroTelefone = numeroTelefone;
  }

  public String getEmail()   
  {  
    return email;  
  }  

  public void setEmail(String email)   
  {  
   this.email = email;  
  }  

  public String getSenha() {
      return senha;
  }

  public void setSenha(String senha) {
      this.senha = senha;
  }

  public String getFuncaoFuncionario() {
      return funcaoFuncionario;
  }

  public void setFuncaoFuncionario(String funcaoFuncionario) {
      this.funcaoFuncionario = funcaoFuncionario;
  }


}   
