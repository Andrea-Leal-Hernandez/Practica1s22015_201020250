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
public class NodoOrtogonal {
 
    int dato, x, y;
    NodoOrtogonal arriba;
    NodoOrtogonal abajo;
    NodoOrtogonal izquierda;
    NodoOrtogonal derecha;

    public NodoOrtogonal(int dato, int x, int y) {
        this.dato = dato;
        this.x = x;
        this.y = y;
        arriba = null;
        abajo = null;
        izquierda = null;
        derecha = null;
    }
    
    
    
}
