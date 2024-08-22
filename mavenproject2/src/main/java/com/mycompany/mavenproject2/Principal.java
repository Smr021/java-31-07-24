/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author us-man
 */
public class Principal {

    public static void main(String[] args) {
        Fisica fisica1 = new Fisica(Sexo.FEMININO, "445/4545/656", "Marta", "748421626", "saomomfosmo@sasa.com","sasas");
        Juridica juridica1 = new Juridica("46565", "6565654", "Martinha", "76565654", "aomsoam@askaos.com","sssssss");
        Endereco lugar = new Endereco("ssassa", "19", "logo ali", "487892929", "Salbara", UnidadeFederativa.BAHIA, "brasil", "959952925", "saomsomoas@okooas,mo.com", Endereco);
        
        
        System.out.println(fisica1);
    }
}
