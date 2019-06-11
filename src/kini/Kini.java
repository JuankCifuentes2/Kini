/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kini;

import java.util.Random;

/**
 *
 * @author Español
 */
public class Kini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tam= 6;
        int sorteo[] = new int [tam];
        
        for (int i =0;i<tam;i++){
       Random generadorAleatorios = new Random();
       int NumeroAleatorio = generadorAleatorios.nextInt(45);
       System.out.println("numero aleatorio "+  NumeroAleatorio);
        // TODO code application logic here
    }
    
}
   } 