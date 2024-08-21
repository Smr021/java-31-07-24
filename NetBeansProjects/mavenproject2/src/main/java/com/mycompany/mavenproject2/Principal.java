/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Juridica pessoaJuridica = new Juridica("00016565", "1656", "Marta Soluções ltda", "74656262");        
        Fisica pessoaFisica = new Fisica("856465656", "795994995", "45/456/54", "Marta", "795456");
        
        System.out.println(pessoaFisica);
        
    } 
}
