/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Andrea
 */
public class Game  extends JPanel {

        Hongos ho = new Hongos();
        
        
        
    Game(){
        this.setSize(900,600);
        this.setBackground(Color.cyan);
          
         
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int ancho = getWidth();
        int alto = getHeight();
        for(int i = 0; i<=ancho; i+=30 ){
            for (int j = 0 ; j<=alto ; j +=30){
        g.drawRect(0, 0, i, j);
        ho.loadImage("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\carre2.png");
        g.drawImage(ho.getImage(), ho.getX(), ho.getY(), this);
        
        }
        }
    }
    
}
