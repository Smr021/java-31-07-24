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
        Funcionarios funcionario = new Funcionarios("Marta", 20, 1560);
        
        //funcionario.setNome("Marta");
        //funcionario.setIdade(20);
        //funcionario.setSalario(1560);
        
        
        System.out.println("O nome do Funcionario é : " + funcionario.getNome());
        System.out.println("A idade do Funcionario é : " + funcionario.getIdade());
        System.out.printf("O salario do Funcionario é : %.2f%n", funcionario.getSalario());
    }
}
