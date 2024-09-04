/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulax29x08x2024xexercicio01;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{
    double bonificacaoG = (salario * Bonificacao.GERENTE.getValor());
    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg,
            Endereco endereco, Setor setor, Sexo sexo,
            double salario, String dataDeNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario,
                dataDeNascimento);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double SalarioFinal() {
        return (bonificacao.GERENTE.getValor() + salario);
    }

    

        
    
}
