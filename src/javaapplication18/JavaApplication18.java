/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String driverURL = "jdbc:derby://localhost:1527/2017-3-DCC171";
            Connection conexao = DriverManager.getConnection(driverURL,"usuario","senha");
            JanelaBD janela = new JanelaBD(conexao);
            janela.setLocationRelativeTo(null);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);
            janela.consultaBD(conexao);
        } catch (Exception ex) {
            Logger.getLogger(JavaApplication18.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
