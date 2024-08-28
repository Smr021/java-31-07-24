/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenpr28x08x2024xativ03;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("895959595", "greks", "25/4/2211", Setor.OPERACOES, Sexo.FEMININO, 566);
        
        Diretor diretor = new Diretor("sad", "26/62/26", Setor.OPERACOES, Sexo.FEMININO, 6622);
        
        System.out.println(motoboy);
        System.out.println(diretor);
        
        //Uso do metodo de acesso apenas ao Diretor.
        
        diretor.demitir(motoboy);
    }
}
