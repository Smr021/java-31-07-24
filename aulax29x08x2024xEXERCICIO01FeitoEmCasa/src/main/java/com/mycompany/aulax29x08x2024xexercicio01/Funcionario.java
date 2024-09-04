/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulax29x08x2024xexercicio01;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco endereco;
    protected Setor setor;
    protected Sexo sexo;
    protected double salario;
    protected String dataDeNascimento;

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.sexo = sexo;
        this.salario = salario;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    
  @Override
    public String toString() {
        return "\nNome: " + nome + 
                "\nCpf: " + cpf + 
                "\nRg: " + rg + 
                "\n Endereco: " + endereco + 
                "\nSetor: " + setor + 
                "\nSexo: " + sexo + 
                "\nSalario: " + salario + 
                "\nDataDeNascimento: " + dataDeNascimento ;
    }
    
}
