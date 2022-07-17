/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import UTIL.Campo;
import java.util.ArrayList;

public class ProdutosDTO extends Tabela {

    private Campo<Integer> ID_PRODUTO = new Campo<>("Id_Produto", true);
    private Campo<String> descricao_produto = new Campo<>("Descricao_Produto");
    private Campo<Double> preco_produto = new Campo<>("Preco_produto");
    private Campo<Character> situacao_produto = new Campo<>("Situacao_Produto");

    @Override
    public ArrayList<Campo> retornaCampos() {
        ArrayList<Campo> listaCampos = new ArrayList<>();
        listaCampos.add(getID_PRODUTO());
        listaCampos.add(getDescricao_produto());
        listaCampos.add(getPreco_produto());
        listaCampos.add(getSituacao_produto());
        return listaCampos;
    }

    public Campo<Integer> getID_PRODUTO() {
        return ID_PRODUTO;
    }

    public void setID_PRODUTO(Integer ID_PRODUTO) {
        this.ID_PRODUTO.valorCampo = ID_PRODUTO;
    }

    public Campo<String> getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto.valorCampo = descricao_produto;
    }

    public Campo<Double> getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(Double preco_produto) {
        this.preco_produto.valorCampo = preco_produto;
    }

    public Campo<Character> getSituacao_produto() {
        return situacao_produto;
    }

    public void setSituacao_produto(Character situacao_produto) {
        this.situacao_produto.valorCampo = situacao_produto;
    }

}
