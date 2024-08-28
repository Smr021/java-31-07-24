/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.mavenpr28x08x2024xativ03;

/**
 *
 * @author Aluno
 */
public enum Setor {
    RECURSOS_HUMANOS ("Recursos Humanos"),
    FINACEIROS ("Financeiros"),
    OPERACOES ("Operacoes");
    private String name;

    private Setor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
}
