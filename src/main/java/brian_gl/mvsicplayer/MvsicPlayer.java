/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package brian_gl.mvsicplayer;

import brian_gl.mvsicplayer.frames.MusicPlayerFrame;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author LENOVO
 */
public class MvsicPlayer {

     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        try {
            /* Set the FatDarkLaf look and feel */
            FlatDarculaLaf ui = new FlatDarculaLaf();
            
            UIManager.setLookAndFeel(ui);
            
            /* Create and display the form */
            EventQueue.invokeLater(() -> {
                new MusicPlayerFrame().setVisible(true);
            });
            
        } catch (UnsupportedLookAndFeelException ex) {
            
        }
    }
}
