/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro{" + 
                "crea=" + crea + '}';
    }

    
    
    
    
}
