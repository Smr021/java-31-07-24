/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulax29x08x2024xexercicio01;

/**
 *
 * @author Aluno
 */
public class Aulax29x08x2024xEXERCICIO01 {

    public static void main(String[] args) {
        Endereco end = new Endereco("sald", "55",
                "6as", "498495", "salva",
                UnidadeFederativa.BAHIA);
        
        /*Gerente gerente = new Gerente(Bonificacao.GERENTE,
                "eee", "5656", "75656", end,
                Setor.MARKETING, Sexo.FEMININO, 555,
                "25/56/626");*/
        
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR,
                "santos", "86564658", "4948657", end,
                Setor.MARKETING, Sexo.FEMININO, 5,
                "25/46/6265");
        
        
        System.out.println(diretor);
        
        
    }
}
