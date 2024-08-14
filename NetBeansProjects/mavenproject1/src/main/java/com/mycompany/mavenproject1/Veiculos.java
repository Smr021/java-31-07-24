/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Veiculos {
    private String placa;
    private String cor;
    private int numero_de_passageiros;
    private double capacidade_de_tanque;
    private double velocidade_maxima;
    private double consumo_medio;

   
            
            

    public Veiculos(String placa, String cor, int numero_de_passageiros, double capacidade_de_tanque, double velocidade_maxima, double consumo_medio) {
        this.placa = placa;
        this.cor = cor;
        this.numero_de_passageiros = numero_de_passageiros;
        this.capacidade_de_tanque = capacidade_de_tanque;
        this.velocidade_maxima = velocidade_maxima;
        this.consumo_medio = consumo_medio;
    }

    public double getConsumo_medio() {
        return consumo_medio;
    }

    public void setConsumo_medio(double consumo_medio) {
        this.consumo_medio = consumo_medio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumero_de_passageiros() {
        return numero_de_passageiros;
    }

    public void setNumero_de_passageiros(int numero_de_passageiros) {
        this.numero_de_passageiros = numero_de_passageiros;
    }

    public double getCapacidade_de_tanque() {
        return capacidade_de_tanque;
    }

    public void setCapacidade_de_tanque(double capacidade_de_tanque) {
        this.capacidade_de_tanque = capacidade_de_tanque;
    }

    public double getVelocidade_maxima() {
        return velocidade_maxima;
    }

    public void setVelocidade_maxima(double velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }

   
    
    
}
