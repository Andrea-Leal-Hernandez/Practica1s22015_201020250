/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class ListaDoble {
    private NodoDoble inicio, fin;
 
    public ListaDoble () {
        inicio = fin = null;  
    }
    
    public boolean estVacia(){
        return inicio == null;
    }
    
    public void AgregaralFinal(int el){
        if(!estVacia()){
            fin = new NodoDoble(el, null, fin);
            fin.siguiente.anterior= fin;
        }else{
            inicio = fin = new NodoDoble(el);
        }
    }
    
    public void AgregaralInicio(int el){
        if(!estVacia()){
            inicio = new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio = fin = new NodoDoble(el);
        }
    }
    
    public void MostrarListaInicioFin(){
        if(!estVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
           while(auxiliar!=null){
               datos = datos + "["+ auxiliar.dato+"]<=>";
               auxiliar = auxiliar.siguiente;
           } 
           JOptionPane.showMessageDialog(null, datos,"Mostrando Lista de Principio a Fin",
                   JOptionPane.INFORMATION_MESSAGE);
        }
            
        }
    
     public void MostrarListaFinInicio(){
        if(!estVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = fin;
           while(auxiliar!=null){
               datos = datos + "["+ auxiliar.dato+"]<=>";
               auxiliar = auxiliar.anterior;
           } 
           JOptionPane.showMessageDialog(null, datos,"Mostrando Lista de Fin a Principio",
                   JOptionPane.INFORMATION_MESSAGE);
        }
            
        }
    
    
    }

