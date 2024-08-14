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
        Endereco salva = new Endereco("Rua a", "36", "Salvador");
        Cliente b = new Cliente("Marta", "46",salva);
        
        System.out.println("Nome " + b.getNome());
        System.out.println("Idade: " + b.getIdade());
        System.out.println("Cidade: " + b.getEndereco().getLogradouro());
        System.out.println("Numero: " + b.getEndereco().getNumero());
        System.out.println("Cidade: " + b.getEndereco().getCidade());
    }
}
