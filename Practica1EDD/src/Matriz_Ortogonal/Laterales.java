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
public class Laterales {
    
    NodoLateral primera;
    NodoLateral ultima;
    
    public Laterales(){
        primera = null;
        ultima = null;
    }
    
    public void Insertar(NodoLateral inserta){
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
    
    public void insertarInicio(NodoLateral inserta){
       
        primera.anterior=inserta;
        inserta.siguiente=primera;
        primera = primera.anterior;
    }
    
    public void insertarFinal(NodoLateral inserta){
       
        ultima.siguiente = inserta;
        inserta.anterior = ultima;
        ultima= ultima.siguiente;
    }
    
     public void insertarenMedio(NodoLateral inserta){
       
         NodoLateral temp1;
         NodoLateral temp2;
         temp1 = primera;
         while(temp1.y < inserta.y){
             temp1 = temp1.siguiente;
         }
         temp2 = temp1.anterior;
         temp2.siguiente = inserta;
         temp1.anterior= inserta;
         inserta.siguiente= temp1;
         inserta.anterior =temp2;
    }
     
     public void Recorrer(){
       if(estaVacia()){
           NodoLateral tempo;
           tempo = primera;
       while(tempo!=null){
           System.out.println(tempo.y);
           tempo = tempo.siguiente;
       }
       }
        
    }
     
        public boolean existe(int y, NodoLateral nodo){
         
         if(estaVacia()){
             return false;
         }else{
           NodoLateral temporal;
           temporal = primera;
           while(temporal!=null){
               if(temporal.y!=y){
                   return true;
               }
               else if(temporal.siguiente==null){
                   return false;
               }
               temporal = temporal.siguiente;
           }
             
         }
        return true; 
     }
     
     NodoLateral busqueda(int y){
         NodoLateral temporal;
         temporal = primera;
         if(existe(y,temporal)){
 
             while(temporal.y!=y){
                 temporal = temporal.siguiente;
             }
             return temporal;
         }else{
             return (new NodoLateral(-1));
             
         }  
     }
}


