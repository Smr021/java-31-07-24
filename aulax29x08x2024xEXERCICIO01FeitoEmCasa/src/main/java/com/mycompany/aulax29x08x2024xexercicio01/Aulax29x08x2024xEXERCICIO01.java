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
        
        
        Diretor d = new Diretor(Bonificacao.DIRETOR, "sam", "444", "555", end, Setor.MARKETING, Sexo.FEMININO, 100, "23/5/88");
        
        
        System.out.println(d);
        
        
    }
}
