/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplopolimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Franciele
 */
public class ExemploPolimorfismo {

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        vendedor1.vendasManha = Double.parseDouble(JOptionPane.showInputDialog("Quanto vendeu o vendedor 1 pela manhã?"));
        vendedor1.vendasTarde = Double.parseDouble(JOptionPane.showInputDialog("Quanto vendeu o vendedor 1 pela tarde?"));
        JOptionPane.showMessageDialog(null,"O vendedor 1 vendeu, "+vendedor1.totalVendas()+" Reais e atingiu uma comissão de "+vendedor1.calculaComissao()+" Reais");
        Vendedor vendedor2 = new Vendedor();
        vendedor2.vendasManha = Double.parseDouble(JOptionPane.showInputDialog("Quanto vendeu o vendedor 2 pela manhã?"));
        vendedor2.vendasTarde = Double.parseDouble(JOptionPane.showInputDialog("Quanto vendeu o vendedor 2 pela tarde?"));
        JOptionPane.showMessageDialog(null,"O vendedor 1 vendeu, "+vendedor2.totalVendas()+" Reais e atingiu uma comissão de "+vendedor2.calculaComissao()+" Reais");
        Gerente gerente1 = new Gerente();
        gerente1.vendedor1 = vendedor1; 
        gerente1.vendedor2 = vendedor2;
        JOptionPane.showMessageDialog(null,"A equipe do gerente conseguiu totalizar "+gerente1.totalVendas()+" reais e com isso o gerente 1 ganhou uma comissão de "+gerente1.calculaComissao()+" Reais");
        
    }
}
