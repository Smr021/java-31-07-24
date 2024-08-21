/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public enum sexo {
    MASCULINO ("Masculino"),
    FEMININO ("Feminino");
    private String nome;

    private sexo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
