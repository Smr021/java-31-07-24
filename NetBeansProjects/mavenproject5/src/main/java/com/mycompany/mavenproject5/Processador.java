/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author Aluno
 */
public class Processador extends MarcaModelo {
    private int frequencia;

    public Processador(int frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    
    
    
    
    
    
}
