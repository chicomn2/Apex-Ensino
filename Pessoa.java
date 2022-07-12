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
    private String genero;
    private boolean verificaGenero=false;
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
        } 
    }


    public String getGenero() {
        
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
        switch (genero.toUpperCase()){
            case "M" -> {
                this.genero = "Masculino";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Homem e receberá  mais conteúdo voltado para o público "+getGenero());
                verificaGenero=true;
            }
            case "F" -> { 
                this.genero = "Feminino";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Mulher e receberá  mais conteúdo voltado para o público "+getGenero());
                verificaGenero=true;
            }
            case "L" -> { 
                this.genero = "Lesbica";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Lesbica e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaGenero=true;
            }
            case "G" -> { 
                this.genero = "Gay";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Gay e receberá  mais conteúdo voltado para o público LGBTQICAPF2K+.");
                verificaGenero=true;
            }
            case "B" -> { 
                this.genero = "Bissexual";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Bissexual e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaGenero=true;
            }
            case "T" -> { 
                this.genero = "Transsexual";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Transsexual e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaGenero=true;
            }
            case "Q" -> { 
                this.genero = "Queer";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Queer e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaGenero=true;
            }
            case "I" -> { 
                this.genero = "Intergenero";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Intergenero e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaGenero=true;
            }
            case "C" -> { 
                this.genero = "Curioso";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Curioso e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaGenero=true;
            }
            case "A" -> { 
                this.genero = "Assexual";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Assexual e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaGenero=true;
            }
            case "P" -> { 
                this.genero = "Pansexual";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Pansexual e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaGenero=true;
            }
            case "2" -> { 
                this.genero = "Two-spirit";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Two-Spirit e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaGenero=true;
            }
            case "K" -> { 
                this.genero = "Kink";
                JOptionPane.showMessageDialog(null, "Ok "+getNome()+", você se cadastrou como Kink e receberá  mais conteúdo voltado para o público LGBTQICAP2K+.");
                verificaGenero=true;
            }
                
            default -> JOptionPane.showMessageDialog(null,"Você não digitou uma letra referente a alguma orientação sexual.");
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
       if(verificaEmail==true && verificaIdade ==true && verificaGenero==true){
       JOptionPane.showMessageDialog(null,"Parabéns "+getNome()+" você agora é um assinante da Newsletter 'Jornal do Juvenal', com conteúdos personalizados as suas preferências.");
       JOptionPane.showMessageDialog(null,"Seu cadastro é: "+
               "\n Nome: "+getNome()+
               "\n Nome Maiúsculo (Porque o professor pediu): "+getNomeMaiusculo()+
               "\n Nome Minúsculo  (Porque o professor pediu): "+getNomeMinusculo()+
               "\n Idade: "+getIdade()+
               "\n Genero: "+getGenero()+
               "\n E-mail: "+getEmail());
       } else {JOptionPane.showMessageDialog(null, "Cadastro incompleto/incorreto tente novamente.");
   }
        
}
}