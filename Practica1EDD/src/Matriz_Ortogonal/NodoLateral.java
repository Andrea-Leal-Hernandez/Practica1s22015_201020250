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
    
    int y;
    NodoLateral siguiente;
    NodoLateral anterior;
    ListaHorizontal fila;
    
    NodoLateral(int y){
        this.y = y;
        fila = new ListaHorizontal();
        siguiente = null;
        anterior=null;
    }
    
    
    
}
