/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segundaaula;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SegundaAula {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        int a = 10;
        int b = 2;
        int maior;
        
        if (a > b) {
          maior = a;  
        } else {
          maior = b;
        }
        System.out.println("O maior número é: " + maior);
    }
}
