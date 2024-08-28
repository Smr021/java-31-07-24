/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproj28x08x2024;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        Gato mi = new Gato();
        Galo franguinho = new Galo();
        Pato patinho = new Pato();
        
        
        
        System.out.println(toto.emitirSom());
        System.out.println(mi.emitirSom());
        System.out.println(franguinho.comer() + franguinho.emitirSom());
        System.out.println(patinho.emitirSom() + patinho.comer());
        
    }
}
