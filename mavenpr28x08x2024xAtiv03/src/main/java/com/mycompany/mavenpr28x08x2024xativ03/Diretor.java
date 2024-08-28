/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenpr28x08x2024xativ03;

/**
 *
 * @author Aluno
 */
public class Diretor extends Funcionario implements Contratacao{
    //constante (final)
    final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Setor setor, Sexo sexo, double salarioBase) {
        super(nome, dataNascimento, setor, sexo, salarioBase);
    }    
    
    @Override
    public double getSalarioFinal() {
        double salarioFinal;
        salarioFinal = super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("=== Admitindo Funcionario ===");
        System.out.println("=== Dados do funcionario ===");
        System.out.println(funcionario.toString() );
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("=== Admitindo Funcionario ===");
        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());
    }
    
    public double getPREMIO(){
        return PREMIO;
    }

    @Override
    public String toString() {
        return  super.toString()
                + "PREMIO " + PREMIO;
    }
    
}
