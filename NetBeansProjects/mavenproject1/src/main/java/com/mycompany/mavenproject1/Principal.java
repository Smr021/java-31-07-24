/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
       Veiculos carro = new Veiculos("pka5653", "azul", 4, 50.0, 200.0, 11.4);
       
       Cliente cliente1 = new Cliente("Marta", 22, "6499262069", "Rua A", "7565626");
       
        System.out.println("Dados do veiculo: ");
        System.out.println("Placa " + carro.getPlaca());
        System.out.println("Cor " + carro.getCor());
        System.out.println("Numero de passageiros " + carro.getNumero_de_passageiros());
        
    }
    
    
    
    
}
