/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario {
    private String crm;

    public Medico(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico" + 
                "crm=" + crm ;
    }

    
}
