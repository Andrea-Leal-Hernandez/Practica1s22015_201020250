/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.io.File;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Andrea
 */
public class ListaDoble {
    NodoDoble inicio, fin;
    boolean comparacion;
     
    public ListaDoble () {
        inicio = fin = null;  
    }
    
    public boolean estVacia(){
        return inicio == null;
    }
    
    public void AgregaralFinal(Elemento el){
        if(!estVacia()){
            fin = new NodoDoble(el, null, fin);
            fin.siguiente.anterior= fin;
        }else{
            inicio = fin = new NodoDoble(el);
        }
    }
    
    public void AgregaralInicio(Elemento el){
        if(!estVacia()){
            inicio = new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio = fin = new NodoDoble(el);
        }
    }
    
    public void MostrarListaInicioFin(){
        if(!estVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
           while(auxiliar!=null){
               datos = datos + "["+ auxiliar.es+"]<=>";
               auxiliar = auxiliar.siguiente;
           } 
           JOptionPane.showMessageDialog(null, datos,"Mostrando Lista de Principio a Fin",
                   JOptionPane.INFORMATION_MESSAGE);
        }
            
        }
    
     public void MostrarListaFinInicio(){
        if(!estVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = fin;
           while(auxiliar!=null){
               datos = datos + "["+ auxiliar.es+"]<=>";
               auxiliar = auxiliar.anterior;
           } 
           JOptionPane.showMessageDialog(null, datos,"Mostrando Lista de Fin a Principio",
                   JOptionPane.INFORMATION_MESSAGE);
        }
            
        }
    
     
     void eliminarMedio(NodoDoble eliminar)
    {
        NodoDoble aux1 = eliminar.anterior;
        NodoDoble aux2 = eliminar.siguiente;
        aux1.siguiente = aux2;
        aux2.anterior = aux1;

    }
     
     void eliminarInicio(){
             if(inicio == fin){
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
             }
     
      public void pilacola(){
        if(comparacion==true){
            Cargar.listaD.EliminarFinal();
            System.out.println(Cargar.listaD);
                    
        }else{
            Cargar.listaD.eliminarInicio();
            System.out.println(Cargar.listaD);
        }
     }
        
        
    public String Grafhicar(){
    String hola = "";
    int contador = 1;
    NodoDoble aux = fin;
    String sig = "";
    String ant = "";
    
   
    while(aux!=null){
       hola = hola + contador + "[label ="+ aux.es.nombre+ aux.es.tipo+"];\n";
       System.out.println(aux.es.nombre);
       aux = aux.anterior;
        contador ++;
       }
    System.out.println(hola);
    contador --;
    for (int l=1 ; l<contador;){
       sig = sig + l +"->"+ ++l+";\n"; 
    }
    System.out.println(sig);
    for(int l=1; l< contador;){
        ant = ant +contador+ "->" + (--contador)+";\n";
    }
    System.out.println("digraph G{\n"+ hola+ sig + ant +"}");
    System.out.println(ant); 
    return "digraph G{\n"+ hola+ sig + ant +"}";
                  
}
    
   public void CargaObjetos(JPanel jPanelCargar){
     int contador =0;
      NodoDoble temporal = inicio;
     int contar = 50;
     while(temporal!=null){
         if(temporal.es.tipo==("MARIO")){
         ImageIcon ima = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\mario_1.png");
         temporal.setIcon(ima);
         temporal.setBounds(18, 25+contador*contar, 40,40);
         jPanelCargar.add(temporal);
         jPanelCargar.repaint();
         
         contador ++;
         
         } else if(temporal.es.tipo==("HONGO")){
         ImageIcon img = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\hongo22.jpg");
         temporal.setIcon(img);
         temporal.setBounds(10,25+contador*contar, 40, 40);
         jPanelCargar.add(temporal);
         jPanelCargar.repaint();
         contador ++;
         
         } else if(temporal.es.tipo==("PARED")){
         ImageIcon img = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\pared2.jpg");
         temporal.setIcon(img);
         temporal.setBounds(10, 25+contador*contar,40,40);
         jPanelCargar.add(temporal);
         jPanelCargar.repaint();
         contador ++;
         
         }else if(temporal.es.tipo==("TORTUGA")){
         ImageIcon img = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\tortuga.jpg");
         temporal.setIcon(img);
         temporal.setBounds(10, 25+contador*contar,40,40);
         jPanelCargar.add(temporal);
         jPanelCargar.repaint();
         contador ++;
         
         }else if(temporal.es.tipo==("MONEDA")){
         ImageIcon img = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\fichaa.jpg");
         temporal.setIcon(img);
         temporal.setBounds(10, 25+contador*contar,  40,40);
         jPanelCargar.add(temporal);
         jPanelCargar.repaint();
         contador ++;
         
         }else if(temporal.es.tipo==("CASTILLO")){
         ImageIcon img = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\castillo2.jpg");
         temporal.setIcon(img);
         temporal.setBounds(10, 25+contador*contar, 40, 40);
         jPanelCargar.add(temporal);
         jPanelCargar.repaint();
         contador ++;
         
         }else if(temporal.es.tipo==("GOOMBA")){
         ImageIcon img = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\goomba2.jpg");
         temporal.setIcon(img);
         temporal.setBounds( 10, 25+contador*contar, 40, 40);
         jPanelCargar.add(temporal);
         jPanelCargar.repaint();
         contador ++;
         
         }else if(temporal.es.tipo==("SUELO")){
         ImageIcon img = new ImageIcon("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Practica1s22015EDD_201020250\\Practica1EDD\\src\\imagenes\\suelo2.jpg");
         temporal.setIcon(img);
         temporal.setBounds(10, 25+contador*contar, 40, 40);
         jPanelCargar.add(temporal);
         jPanelCargar.repaint();
         contador ++;
         
         }
     temporal=temporal.siguiente;
     }
    
    }
     
     public void EliminarFinal(){
             if(inicio == fin){
            inicio = fin = null;
        }else{
            fin = fin.anterior;
            fin.siguiente = null;
        }
             }
    }

