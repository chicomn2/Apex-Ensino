/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificaemail;

import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class Pessoa {
    private String nome;
    private int idade;
    private boolean verificaIdade=false;
    private String sexo;
    private boolean verificaSexo=false;
    private String email;
    private boolean verificaEmail=false;

    public String getNome() {
        return nome;
    }
    
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
    
    public String getNomeMinusculo() {
        return nome.toLowerCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        if(idade>17){
            JOptionPane.showMessageDialog(null, "Muito bem, "+getNome()+" você tem idade para receber nossos cadernos de conteúdo adulto como política e outras coisas chatas. \n(Não trabalhamos com conteúdo erótico.)");
            verificaIdade = true;
        }else if (idade>=0){
            JOptionPane.showMessageDialog(null, "Alguns cadernos serão restritos para você "+getNome()+", porém você receberá  mais conteúdo voltado para games e jogos de tabuleiro.");
            verificaIdade = true;
        } else {
            JOptionPane.showMessageDialog(null,"Idade inválida");
        }
    }


    public String getSexo() {
        
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
        switch (sexo.toUpperCase()){
            case "M":
                this.sexo = "Masculino";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Homem e receberá  mais conteúdo voltado para o público "+getSexo());
                verificaSexo=true;
                break;
            case "F": 
                this.sexo = "Feminino";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Mulher e receberá  mais conteúdo voltado para o público "+getSexo());
                verificaSexo=true;
                break;
            case "L": 
                this.sexo = "Lesbica";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Lesbica e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaSexo=true;
                break;
            case "G": 
                this.sexo = "Gay";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Gay e receberá  mais conteúdo voltado para o público LGBTQICAPF2K+.");
                verificaSexo=true;
                break;
            case "B": 
                this.sexo = "Bissexual";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Bissexual e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaSexo=true;
                break;
            case "T": 
                this.sexo = "Transsexual";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Transsexual e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaSexo=true;
                break;
            case "Q": 
                this.sexo = "Queer";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Queer e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaSexo=true;
                break;
            case "I": 
                this.sexo = "Intersexo";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Intersexo e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaSexo=true;
                break;
            case "C": 
                this.sexo = "Curioso";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Curioso e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaSexo=true;
                break;
            case "A": 
                this.sexo = "Assexual";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Assexual e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaSexo=true;
                break;
            case "P": 
                this.sexo = "Pansexual";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Pansexual e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaSexo=true;
                break;
            case "2": 
                this.sexo = "Two-spirit";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Two-Spirit e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaSexo=true;
                break;
            case "K": 
                this.sexo = "Kink";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Kink e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaSexo=true;
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Você não digitou uma letra referente a alguma orientação sexual.");
                break;
             }
    }

  
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        if(email.contains("@")){
        this.email = email;
        verificaEmail=true;
    } else{
            JOptionPane.showMessageDialog(null,getNome()+", você digitou um e-mail inválido.");
            }
    
}
    
    public void verificaCadastro(){
       if(verificaEmail==true && verificaIdade ==true && verificaSexo==true){
       JOptionPane.showMessageDialog(null,"Parabéns "+getNome()+" você agora é um assinante da Newsletter 'Jornal do Juvenal', com conteúdos personalizados as suas preferências.");
       JOptionPane.showMessageDialog(null,"Seu cadastro é: "+
               "\n Nome: "+getNome()+
               "\n Nome Maiúsculo (Porque o professor pediu): "+getNomeMaiusculo()+
               "\n Nome Minúsculo  (Porque o professor pediu): "+getNomeMinusculo()+
               "\n Idade: "+getIdade()+
               "\n Sexo: "+getSexo()+
               "\n E-mail: "+getEmail());
       } else {JOptionPane.showMessageDialog(null, "Cadastro incompleto/incorreto tente novamente.");
   }
        
}
}