/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author Aluno
 */
public class Memoria extends MarcaModelo {
    private String capacidade;

    public Memoria(String capacidade, String marca, String modelo) {
        super(marca, modelo);
        this.capacidade = capacidade;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
    
    
    
}
