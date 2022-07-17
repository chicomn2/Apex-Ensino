/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ProjetoPrincipal;

import DAO.ComandosDAO;
import DTO.ClientesDTO;
import javax.swing.JOptionPane;

public class ProjetoMercado {

    public static void main(String[] args) {
        ComandosDAO DAO = new ComandosDAO();
        ClientesDTO DTO = new ClientesDTO();
        DTO.setID_CLIENTE(16);
        String comando = DAO.apagaRegistro(DTO);
        JOptionPane.showMessageDialog(null, comando);
    }
}
