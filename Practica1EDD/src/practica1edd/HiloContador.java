/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Andrea
 */
public class HiloContador extends Thread{
    private int contador = 0;
    JLabel jl = new JLabel();
    public void run(){
        
        while(true){
            
                jl.setText(Integer.toString(contador++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloContador.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    } 
}
