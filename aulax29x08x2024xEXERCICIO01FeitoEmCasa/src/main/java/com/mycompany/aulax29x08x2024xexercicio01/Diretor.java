/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulax29x08x2024xexercicio01;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    final double PREMIO = 0.5;
    double premioD = (salario * PREMIO);
    double bonificacaoD = (salario * bonificacao.DIRETOR.getValor());
    

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataDeNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataDeNascimento);
    }


    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("=== Admitindo Funcionario ===");
        System.out.println("=== Dados do funcionario ===");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("=== Demitindo Funcionario ===");
        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public double SalarioFinal() {
              
        return (salario + bonificacaoD + premioD);
        
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nPREMIO " + PREMIO +
                "\n Salario Final: " + SalarioFinal();
    }
    
}
