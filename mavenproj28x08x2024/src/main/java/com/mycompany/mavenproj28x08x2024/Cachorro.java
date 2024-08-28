/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproj28x08x2024;

/**
 *
 * @author Aluno
 */
public class Cachorro implements Animal {
    
    // Sobrescrita
    @Override
    public String emitirSom() {
        return "toto";
        
    }

    @Override
    public String comer() {
        return "frango frito";
    }
    
}
