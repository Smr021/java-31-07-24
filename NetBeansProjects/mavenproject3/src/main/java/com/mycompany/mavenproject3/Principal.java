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
        Medico funMedico = new Medico("Marta", "84526262", 4.000);
        Engenheiro funEngenheiro = new Engenheiro("4656", "Marto", "86564656", 7.550);
        Motoboy funMotoboy = new Motoboy("48686526", "Mario", "7646000", 9000.0);
        
        System.out.println(funMotoboy);
    }
}
