/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta", "74 anos",
                new Pet("noen", "3 anos", "Vira lata"));
                                     
        
        System.out.println("Nome do cliente : " + cliente1.getNome());
        System.out.println("Idade do cliente : " + cliente1.getIdade());
        System.out.println("============================");
        
        System.out.println("Nome do pet do cliente : " + cliente1.getPet().getNome());
        System.out.println("Idade do pet cliente : " + cliente1.getPet().getIdade());
        System.out.println("Raça do pet do cliente : " + cliente1.getPet().getRaca());
       
    }
}
