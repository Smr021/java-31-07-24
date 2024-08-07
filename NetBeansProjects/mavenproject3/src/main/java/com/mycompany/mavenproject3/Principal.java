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
        Livros livro = new Livros("A pedra", "Bill Gran", 5, 149.99);
        
        System.out.println("O titulo de o livro " + livro.getTitulo());
        System.out.println("O autor: " + livro.getAutor());
        System.out.println("O numeros de paginas: " + livro.getNumeroDePaginas());
        System.out.printf("O preço: %.2f reais %n", livro.getPreco());
    }
}
