/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author us-man
 */
public class Principal {

    public static void main(String[] args) {
        Endereco lugar = new Endereco("avenida", "78", "logo ali", "47992692", "salgado", UnidadeFederativa.BAHIA);
        Fisica fisica1 = new Fisica(Sexo.FEMININO, "78/15/6629", "Marta", "746926266", "saskdkk@laso.com.br", lugar);
        Juridica juridica1 = new Juridica("46565", "6565654", "Martinha", "76565654", "aomsoam@askaos.com",lugar);
        
        
        System.out.println(fisica1);
        System.out.println(juridica1);
    }
}
