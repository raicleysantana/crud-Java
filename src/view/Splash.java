/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/**
 *
 * @author jarde
 */
public class Splash {

    static void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private final int LARGURA_IMG = 720;
    private final int ALTURA_IMG = 480;
    private final int TEMPO_DE_SPLASH = 6000;
    private final String CAMINHO_GIF = "/images/JAVASPLASH.png";
    
    public Splash(){
        JWindow janelaSplash = new JWindow();
        janelaSplash.setBackground(new Color(0,0,0,0));
        janelaSplash.getContentPane().add(
                new JLabel(
                        "",
                        new ImageIcon(getClass().getResource(CAMINHO_GIF)),
                        SwingConstants.CENTER
                )
        );
        
        Toolkit  toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        
        janelaSplash.setBounds(
                (dimension.width - LARGURA_IMG) / 2,
                (dimension.height - ALTURA_IMG) / 2,
                LARGURA_IMG,
                ALTURA_IMG
        );
        
        janelaSplash.setVisible(true);
        
        try{
                Thread.sleep(TEMPO_DE_SPLASH);
                new TelaPrincipal().setVisible(true);
        }catch(InterruptedException e){}
                janelaSplash.dispose();
    }

    private void setBackground(Color color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
