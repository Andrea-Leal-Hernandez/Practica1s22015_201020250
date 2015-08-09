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
public class ListaHorizontal {
    
     NodoOrtogonal primera;
    NodoOrtogonal ultima;
   
    
    public ListaHorizontal(){
        primera = null;
        ultima = null;
    }
    
    public void Insertar(NodoOrtogonal inserta){
        if(estaVacia()){
            primera=ultima=inserta;
        }
        else{
            
            if(inserta.x < primera.x){
              insertarInicio(inserta);  
                
            }
            else if(inserta.x > ultima.x){
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
       
        primera.izquierda=inserta;
        inserta.derecha=primera;
        primera = primera.izquierda;
    }
    
    public void insertarFinal(NodoOrtogonal inserta){
       
        ultima.derecha = inserta;
        inserta.izquierda = ultima;
        ultima= ultima.derecha;
    }
    
     public void insertarenMedio(NodoOrtogonal inserta){
       
         NodoOrtogonal temp1;
         NodoOrtogonal temp2;
         temp1 = primera;
         while(temp1.x < inserta.x){
             temp1 = temp1.derecha;
         }
         temp2 = temp1.izquierda;
         temp2.derecha = inserta;
         temp1.izquierda= inserta;
         inserta.derecha= temp1;
         inserta.izquierda=temp2;
    }
     
     public void Recorrer(){
       if(estaVacia()){
           NodoOrtogonal tempo;
           tempo = primera;
       while(tempo!=null){
           System.out.println(tempo.x);
           tempo = tempo.abajo;
       }
       }
        
    }
    
    
    
    
}
