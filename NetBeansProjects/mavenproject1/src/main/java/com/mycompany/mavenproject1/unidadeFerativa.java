/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public enum unidadeFerativa {
    BAHIA ("Bahia"),
    SAO_PAULO ("São Paulo"),
    RIO_DE_JANEIRO ("Rio de janeiro");
     private String nome;

    private unidadeFerativa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    

    
    
}
