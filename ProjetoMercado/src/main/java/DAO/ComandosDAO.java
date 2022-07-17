/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Tabela;
import UTIL.Campo;
import java.util.ArrayList;

public class ComandosDAO {

    public String apagaRegistro(Tabela tb) {
        String comando = "DLETE FROM " + tb.nomeTabela + " WHERE ";
        String comandoWhere = "";
        ArrayList<Campo> listaCampos = tb.retornaCampos();
        for (Campo atributo : listaCampos) {
            if (atributo.chavePrimaria) {
                comandoWhere = atributo.nomeCampo + " = " + atributo.valorCampo.toString();
            }
        }
        return comando + comandoWhere;
    }

}
