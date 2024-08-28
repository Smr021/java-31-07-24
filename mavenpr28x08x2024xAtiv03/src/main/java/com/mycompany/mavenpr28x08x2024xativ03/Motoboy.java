/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenpr28x08x2024xativ03;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, String dataNascimento, Setor setor, Sexo sexo, double salarioBase) {
        super(nome, dataNascimento, setor, sexo, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "carteira De Habilitacao " + carteiraDeHabilitacao + '}';
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
    
    
    
}
