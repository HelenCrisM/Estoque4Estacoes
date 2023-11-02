package com.example.application.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //mark class as an Entity   
@Table  //defining class name as Table name  
public class Empresa {
    
    @Id  //mark id as primary key      
    @Column(name="id")   //defining id as column name 
    private int id; 

    @Column(name="cnpj")
    private String cnpj;

    @Column(name="nome")
    private String nome;

    @Column(name="numero_telefone")
    private String numeroTelefone;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="cep")
    private String CEP;

    @Column(name="cidade")
    private String cidade;

    @Column(name="estado")
    private String estado;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcnpj() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
