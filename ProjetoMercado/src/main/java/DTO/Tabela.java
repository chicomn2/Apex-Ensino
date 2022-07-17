/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import UTIL.Campo;
import java.util.ArrayList;

public abstract class Tabela {

    public String nomeTabela;

    public abstract ArrayList<Campo> retornaCampos();
}
