package com.example.application.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //mark class as an Entity   
@Table  //defining class name as Table name  
public class Produto {

    @Id  //mark id as primary key      
    @Column(name="id")   //defining id as column name 
    private int id; 

    @Column(name="nome")
    private String nome;

    @Column(name="tipo")
    private String tipo;

    @Column(name="marca")
    private String marca;

    @Column(name="genero")
    private String genero;

    @Column(name="tamanho")
    private String tamanho;

    @Column(name="quantidade")
    private String quantidade;

    @Column(name="preco_unitario")
    private String precoUnitario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(String precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}

