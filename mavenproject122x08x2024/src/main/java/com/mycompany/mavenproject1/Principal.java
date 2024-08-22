/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Endereco ender = new Endereco("alameda", "56",
                "logo ali", "48791662", "salgadinho", UnidadeFederativa.BAHIA);
        
        Cliente client = new Cliente("784", Sexo.FEMININO,
                EstadoCivil.CASADO, "784/46/65", "Marta", "9959161", "qeijas@llsal.com", ender);
        
        PrestacaoServido prest = new PrestacaoServido("7845-565", "74651-262",
                "00016565", "79955", "Martinha", "746562626", "dadjfoijk@asdsa.com", ender);
        
        
        System.out.println(client);
        System.out.println(prest);
    }
}
