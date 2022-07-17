/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import UTIL.Campo;
import java.util.ArrayList;

public class ClientesDTO extends Tabela {

    private Campo<Integer> ID_CLIENTE = new Campo<>("Id_Cliente", true);
    private Campo<String> nome_cliente = new Campo<>("Nome_Cliente");
    private Campo<Integer> idade_cliente = new Campo<>("Idade_Cliente");
    private Campo<Character> situacao_cliente = new Campo<>("Situacao_Cliente");

    public ClientesDTO() {
        this.nomeTabela = "clientes";
    }

    @Override
    public ArrayList<Campo> retornaCampos() {
        ArrayList<Campo> listaCampos = new ArrayList<>();
        listaCampos.add(getID_CLIENTE());
        listaCampos.add(getNome_cliente());
        listaCampos.add(getIdade_cliente());
        listaCampos.add(getSituacao_cliente());
        return listaCampos;
    }

    public Campo<Integer> getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(Integer ID_CLIENTE) {
        this.ID_CLIENTE.valorCampo = ID_CLIENTE;
    }

    public Campo<String> getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente.valorCampo = nome_cliente;
    }

    public Campo<Integer> getIdade_cliente() {
        return idade_cliente;
    }

    public void setIdade_cliente(Integer idade_cliente) {
        this.idade_cliente.valorCampo = idade_cliente;
    }

    public Campo<Character> getSituacao_cliente() {
        return situacao_cliente;
    }

    public void setSituacao_cliente(Character situacao_cliente) {
        this.situacao_cliente.valorCampo = situacao_cliente;
    }

}
