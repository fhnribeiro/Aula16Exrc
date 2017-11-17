/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

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
    public static void main(String[] args) {
        try {
            
            JanelaBD janela = new JanelaBD();
            janela.setLocationRelativeTo(null);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);
            janela.consultaBD();
            
        } catch (Exception ex) {
            Logger.getLogger(JavaApplication18.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
