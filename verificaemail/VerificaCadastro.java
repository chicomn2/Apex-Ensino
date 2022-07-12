/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.verificaemail;

import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class VerificaCadastro {

    public static void main(String[] args) {
         JOptionPane.showMessageDialog(null,"Bem vindo ao cadastro para a Newsletter 'Jornal do Juvenal'");
        Pessoa p1 = new Pessoa();
        p1.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
        p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Para sabermos quais cadernos você poderá receber "+p1.getNome()+", diga-nos sua idade")));
        p1.setGenero(JOptionPane.showInputDialog("Digite a INICIAL de sua orientação sexual, entre M, F, ou qualquer uma das letras LGBTQICAP2K+"));
        p1.setEmail(JOptionPane.showInputDialog("Digite o seu e-mail"));
        p1.verificaCadastro();
        
        
    }
}
