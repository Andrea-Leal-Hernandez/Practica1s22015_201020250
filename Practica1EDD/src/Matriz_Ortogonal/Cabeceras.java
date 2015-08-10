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
public class Cabeceras {
    NodoCabeza primera;
    NodoCabeza ultima;
    
    public Cabeceras(){
        primera = null;
        ultima = null;
    }
    
    public void Insertar(NodoCabeza inserta){
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
    
    public void insertarInicio(NodoCabeza inserta){
       
        primera.anterior=inserta;
        inserta.siguiente=primera;
        primera = primera.anterior;
    }
    
    public void insertarFinal(NodoCabeza inserta){
       
        ultima.siguiente = inserta;
        inserta.anterior = ultima;
        ultima= ultima.siguiente;
    }
    
     public void insertarenMedio(NodoCabeza inserta){
       
         NodoCabeza temp1;
         NodoCabeza temp2;
         temp1 = primera;
         while(temp1.x < inserta.x){
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
           NodoCabeza tempo;
           tempo = primera;
       while(tempo!=null){
           System.out.println(tempo.x);
           tempo = tempo.siguiente;
       }
       }
        
    }
     
     public boolean existe(int x, NodoCabeza nodo){
         
         if(estaVacia()){
             return false;
         }else{
           NodoCabeza temporal;
           temporal = primera;
           while(temporal!=null){
               if(temporal.x!=x){
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
     
     NodoCabeza busqueda(int x){
         NodoCabeza temporal;
         temporal = primera;
         if(existe(x,temporal)){
 
             while(temporal.x!=x){
                 temporal = temporal.siguiente;
             }
             return temporal;
         }else{
             return (new NodoCabeza(-1));
             
         }  
     }
}
