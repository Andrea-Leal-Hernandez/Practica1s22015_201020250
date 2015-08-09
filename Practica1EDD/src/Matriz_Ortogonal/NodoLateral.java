/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz_Ortogonal;

/**
 *
 * @author Andrea
 */
public class NodoLateral {
    
    int x;
    NodoLateral siguiente;
    NodoLateral anterior;
    ListaVertical columna;
    
    NodoLateral(int x){
        this.x = x;
        columna = new ListaVertical();
        siguiente = null;
        anterior=null;
    }
    
    
    
}
