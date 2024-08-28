/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenpr28x08x2024xativ03;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected Setor setor;
    protected Sexo sexo;
    protected double salarioBase;

    public Funcionario(String nome, String dataNascimento, Setor setor, Sexo sexo, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.setor = setor;
        this.sexo = sexo;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    // A implementação não é obrigatoria
    public abstract double getSalarioFinal();
    
    @Override
    public String toString() {
        return "\n nome " + nome + 
                "\n Data de Nascimento " + dataNascimento + 
                "\n Setor " + setor.getName() + 
                "\n Sexo " + sexo.getName() + 
                "\n SalarioBase " + salarioBase +
                "\n Salario final: " + getSalarioFinal();
    }
    
    
    
}
