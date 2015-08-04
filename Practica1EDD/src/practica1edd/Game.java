/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Andrea
 */
public class Game  extends JPanel {

        Hongos ho = new Hongos();
        Ficha fi = new Ficha();
        JLabel mario = new JLabel();
        JLabel goomba = new JLabel();
        JLabel kingkoopa = new JLabel();
        JLabel ficha = new JLabel();
        JLabel tortuga = new JLabel();
        JLabel pared = new JLabel();
        JLabel suelo = new JLabel();
        JLabel hongo = new JLabel();
        
   
    Game(){
        this.setSize(900,600);
        this.setBackground(Color.cyan);
        this.setLayout(null);
        
         ImageIcon im = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\mario_1.png");
         mario.setIcon(im);
         this.add(mario);
         mario.setBounds(0, 540, 30, 30);
         
         ImageIcon im2 = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\goomba2.jpg");
         goomba.setIcon(im2);
         this.add(goomba);
         goomba.setBounds(300, 300, 30, 30);
         
         ImageIcon im3 = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\hongo22.jpg");
         hongo.setIcon(im3);
         this.add(hongo);
         hongo.setBounds(210, 210, 30, 30);
         
         ImageIcon im4 = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\kingkoopa2.png");
         kingkoopa.setIcon(im4);
         this.add(kingkoopa);
         kingkoopa.setBounds(330, 330, 30, 30);
         
         ImageIcon im5 = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\tortuga.jpg");
         tortuga.setIcon(im5);
         this.add(tortuga);
         tortuga.setBounds(120, 420, 30, 30);
         
         ImageIcon im6 = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\fichaa.jpg");
         ficha.setIcon(im6);
         this.add(ficha);
         ficha.setBounds(390, 390, 30, 30);
         
         ImageIcon im7 = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\pared2.jpg");
         pared.setIcon(im7);
         this.add(pared);
         pared.setBounds(120, 540, 30, 30);
         
         ImageIcon im8 = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\suelo2.jpg");
         suelo.setIcon(im8);
         this.add(suelo);
         suelo.setBounds(0, 570, 30, 30);
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int ancho = getWidth();
        int alto = getHeight();
        for(int i = 0; i<=ancho; i+=30 ){
            for (int j = 0 ; j<=alto ; j +=30){
        g.drawRect(0, 0, i, j);
        
         
        }
        }
    }
    
    
}