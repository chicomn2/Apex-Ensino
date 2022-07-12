/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplopolimorfismo;

/**
 *
 * @author Franciele
 */
public class Vendedor extends Funcionario{
    
    public Double vendasManha;
    public Double vendasTarde;
    
    @Override
    public Double totalVendas(){
        return vendasManha+vendasTarde;    
}
    @Override
    public Double calculaComissao(){
        return totalVendas()*0.1;
    }
}
