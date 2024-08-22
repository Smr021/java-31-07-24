/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;



/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    private Sexo sexo;
    private EstadoCivil estadoCivil;
    private String dataNascimento;

    public Fisica(Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "\n Pessoa Fisica " + 
                super.toString() +
                "\n Sexo: " + sexo.getNome() + 
                "\n EstadoCivil: " + estadoCivil.getNome() + 
                "\n Data de Nascimento: " + dataNascimento ;
    }
    
    
}
