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
public class ListaVertical {
    
    NodoOrtogonal primera;
    NodoOrtogonal ultima;
   
    
    public ListaVertical(){
        primera = null;
        ultima = null;
    }
    
    public void Insertar(NodoOrtogonal inserta){
        if(estaVacia()){
            primera=ultima=inserta;
        }
        else{
            
            if(inserta.y < primera.y){
              insertarInicio(inserta);  
                
            }
            else if(inserta.y > ultima.y){
              insertarFinal(inserta);  
            }
            else { 
               insertarenMedio(inserta); 
            }
        }
    }
    
    public boolean estaVacia(){
        return primera == null;
    }
    
    public void insertarInicio(NodoOrtogonal inserta){
       
        primera.arriba=inserta;
        inserta.abajo=primera;
        primera = primera.arriba;
    }
    
    public void insertarFinal(NodoOrtogonal inserta){
       
    }
    
     public void insertarenMedio(NodoOrtogonal inserta){
       
    }
}
