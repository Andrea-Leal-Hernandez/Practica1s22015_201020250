/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JLabel;

/**
 *
 * @author Andrea
 */
public class NodoDoble extends JLabel {
    Elemento es;
    NodoDoble siguiente, anterior;
    
    public NodoDoble(Elemento el)
    {
        this(el,null,null);
    }
    
    public NodoDoble(Elemento el, NodoDoble s, NodoDoble a)
    {
        es = el;
        siguiente = s;
        anterior = a;
        
        
    }
    
    public void puntoMouse(NodoDoble nodo){
       Point po = MouseInfo.getPointerInfo().getLocation();
       System.out.println(po);
       nodo.setLocation(po.x-1, po.y-1);
    }
    
    
    
}

