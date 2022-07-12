/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplopolimorfismo;

/**
 *
 * @author Franciele
 */
public class Gerente extends Funcionario{
    Vendedor vendedor1;
    Vendedor vendedor2;
    public Gerente (){
        vendedor1 = new Vendedor();
        vendedor2 = new Vendedor();
    }
    
    @Override
    public Double totalVendas(){
        return vendedor1.totalVendas()+vendedor2.totalVendas();
    }
    
    @Override
    public Double calculaComissao(){
        return totalVendas()*0.02;
    }
    
}
