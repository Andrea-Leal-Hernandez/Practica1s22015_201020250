/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import practica1edd.NodoDoble;

/**
 *
 * @author Andrea
 */
public class ListaCargar {
    
    NodoDoble inicio;
    NodoDoble fin;
    
    public ListaCargar(){
        inicio = fin = null;
    }
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
            public void insertarFinal(int a){
             if(!estaVacia()){
                 fin = new NodoDoble (a,null,fin);
                 
             }
            }
           
           
}
