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
        int k = 0;
        int l = 0;
        int n = 0;
        int sorteo[] = new int [tam];
        
        
       
       
       if (l==0){
       Random generadorAleatorios = new Random();
       int NumeroAleatorio = generadorAleatorios.nextInt(45);   
       sorteo[0]= NumeroAleatorio;
       System.out.println("El numero "+ l + " es "+ sorteo[0]);
       l = l +1;

        }
       
       while(l<6){
       Random generadorAleatorios = new Random();
       int NumeroAleatorio = generadorAleatorios.nextInt(45);
       System.out.println("Genere el numero" + NumeroAleatorio);
       n = k = 0;
       
          for(int j=0;j<l;j++){
          
          if(NumeroAleatorio==sorteo[j]){
              
              k = k + 1;
          System.out.println("Aca llego");
              
              
          }
          
          if(NumeroAleatorio!=sorteo[j]){
              
              k = k + 1;
              n = n + 1;
           System.out.println("Pase");
             
          }
          
          }    
       
          if (n==k){
          sorteo[l]= NumeroAleatorio;
          System.out.println("sorteo"+ l + " es " + NumeroAleatorio);
          l = l+ 1;
          }
       
       
    } 
       
         for (int i =0;i<tam;i++){
     
     System.out.println("El numero "+ i + " es "+ sorteo[i]); 
       
}
        
    }}
     
     
         
        
    