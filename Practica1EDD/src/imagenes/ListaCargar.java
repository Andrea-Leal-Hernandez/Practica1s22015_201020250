/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import practica1edd.Nodo;

/**
 *
 * @author Andrea
 */
public class ListaCargar {
    
            public void insertarInicio(Integer d){
            Nodo nuevo = new Nodo(d);
            if(inicio==null){
            inicio=nuevo;
            }else{
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
            }
            }
           

  

            public void insertarFinal(Integer d){
            NodoDoble nuevo = new NodoDoble(d);
            if(inicio == null){
            inicio = nuevo;
            }else{
            NodoDoble aux = inicio;
            while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
           
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);

            }
           
            }
           



public void eliminaValor(Integer valor){
                        if (inicio != null){
                                   NodoDoble aux = inicio;
                                   NodoDoble ant = null;
                                   while (aux != null){
                                               if (aux.getDato() == valor ){
                                                           if (ant == null){
                                                                       inicio = inicio.getSiguiente();
                                                                       aux.setSiguiente(null);
                                                                       aux= inicio;
                                                          
                                                           }else {
                                                                       ant.setSiguiente(aux.getSiguiente());
                                                                       aux.setSiguiente(null);
                                                                       aux = ant.getSiguiente();
                                                           }                                             
                                                           }else{
                                                                       ant = aux;
                                                                       aux = aux.getSiguiente();
                                                           }
                                               }
                                   }
                                  
                        }
           
           

            public void buscar(Integer valor){
                        if (inicio != null){
                                   NodoDoble aux = inicio;
                                  
                                   int cont = 0;
                                   while (aux != null){
                                               if (aux.getDato() == valor ){
                                                           cont++;
                                                           aux = aux.getSiguiente();
                                                          
                                               }
                                  
                                   }                     
                                  
                                              
                       
                        }
                       
                        }
           
}
