/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class PrestacaoServido extends Juridica{
    private String contratoInicio;
    private String contratoFim;

    public PrestacaoServido(String contratoInicio, String contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public String getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(String contratoFim) {
        this.contratoFim = contratoFim;
    }

    public String getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(String contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    @Override
    public String toString() {
        return "\n PrestacaoServido: " + 
                super.toString() +
                "\n ContratoInicio: " + contratoInicio + 
                "\n ContratoFim: " + contratoFim ;
    }
    
    
}
