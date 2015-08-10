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
public class MatrizOrtogonal {
    Cabeceras c;
    Laterales l;
    
    
    MatrizOrtogonal(){
        c = new Cabeceras();
        l = new Laterales();
    }
    
    public void insertar(int x, int y, int inserta){
            if(c.existe(x, null)==false){
                c.Insertar(new NodoCabeza(x));
            
        }
            if(l.existe(y, null)==false){
                l.Insertar(new NodoLateral(y));
            }
    NodoCabeza CTemporal;
    NodoLateral LTemporal;
    NodoOrtogonal insercion;
    insercion = new NodoOrtogonal(inserta,x,y);
            CTemporal = c.busqueda(x);
            LTemporal = l.busqueda(y);
            
            CTemporal.columna.Insertar(insercion);
            LTemporal.fila.Insertar(insercion);
        }
    
    public void llenar(int x, int y){
          int o=0;
    for(int j=0; j<y; j++){
        
        for(int i=0; i<x; i++){
            insertar(i,j,o);
            o++;
        }
    }
    }
    
    
    
}
