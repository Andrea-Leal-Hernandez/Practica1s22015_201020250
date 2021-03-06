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
       
        ultima.abajo = inserta;
        inserta.arriba = ultima;
        ultima= ultima.abajo;
    }
    
     public void insertarenMedio(NodoOrtogonal inserta){
       
         NodoOrtogonal temp1;
         NodoOrtogonal temp2;
         temp1 = primera;
         while(temp1.y < inserta.y){
             temp1 = temp1.abajo;
         }
         temp2 = temp1.arriba;
         temp2.abajo = inserta;
         temp1.arriba= inserta;
         inserta.abajo= temp1;
         inserta.arriba=temp2;
    }
     
     public void Recorrer(){
       if(estaVacia()){
           NodoOrtogonal tempo;
           tempo = primera;
       while(tempo!=null){
           System.out.println(tempo.y);
           tempo = tempo.abajo;
       }
       }
        
    }
}
