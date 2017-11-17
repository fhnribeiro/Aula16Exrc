/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 11944413600
 */
public class Visitante {
    private String nome;
    private Long id;
    private int idade;
    private Date entrada;
    private Date saida;

    public Visitante() {
    }

    public Visitante(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Visitante(String nome, int idade, Date entrada) {
        this.nome = nome;
        this.idade = idade;
        this.entrada = entrada;
    }

    public Visitante(Long id, String nome, int idade, Date entrada, Date saida) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.entrada = entrada;
        this.saida = saida;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    
    
}
