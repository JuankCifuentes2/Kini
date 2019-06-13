/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kini;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Español
 */
public class Kini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
       
        
        int[] arreglo = new int [6];
        
        int tam= 6;
        int k = 0;
        int cont = 0;
        int l = 0;
        int n = 0;
        int m = 0;
        int aux = 0;
        int sorteo[] = new int [tam];
        
        
        //Usuario Ingresa los numeros, programa valida que sean entre 0 y 45
        
         System.out.println("Hola ahora ingresa tus numeros ");
        //Se pide Ingresar numero
        while (m<6){
        System.out.println("Ingresa tu numero" + (m+1));
        aux = entrada.nextInt();
        //Se evalua que este entre 0 y 45
        if(aux>45||aux<0){   
        System.out.println("ERROR Recuerda que el numero debe estar entre 0 y 45");
        }
        if(aux<46&&aux>-1){
        if (m>0){
         n = k = 0;
       // Se evalua que el numero ingresado no este en el arreglo
          for(int j=0;j<m;j++){
          if(aux==arreglo[j]){
              k = k + 1;    
          }
          if(aux!=arreglo[j]){
              k = k + 1;
              n = n + 1;   
          }
          } 
          //Si el numero ingresado no esta en el arreglo se agrega
          if (n==k){
          arreglo[m]= aux;
          m = m+ 1;
          }
          if (n!=k){
          System.out.println("El numero " + aux + " ya lo elegiste ");      
          }
        }
          if (m==0){
            arreglo[m]= aux;
          m = m+1;
            }
            }   
        }    
        
        //Se Ordena arreglo ingresado por Usuario
        Arrays.sort(arreglo);

// Imprime el arreglo ordenado 
        System.out.println("Los numeros que elegiste fueron");
        for (int i =0;i<tam;i++){
     
        System.out.print(arreglo[i]+" ");         
        }
                
                
       
       

        //Programa genera los aleatorios validando que no se repitan
       
       if (l==0){
       Random generadorAleatorios = new Random();
       int NumeroAleatorio = generadorAleatorios.nextInt(45);   
       sorteo[0]= NumeroAleatorio;
       l = l +1;
       }
       
       while(l<6){
       Random generadorAleatorios = new Random();
       int NumeroAleatorio = generadorAleatorios.nextInt(45);
       n = k = 0;
       
          for(int j=0;j<l;j++){
          if(NumeroAleatorio==sorteo[j]){
              k = k + 1;   
          }
          
          if(NumeroAleatorio!=sorteo[j]){
              k = k + 1;
              n = n + 1;
             
          }
          }    
       
          if (n==k){
          sorteo[l]= NumeroAleatorio;
          l = l+ 1;
          }
            } 
       

     
   //Se Ordenan numeros de sorteo
     Arrays.sort(sorteo);

// Imprime el arreglo ordenado 
        System.out.println(" ");
        System.out.println("Los numeros sorteados son");
        for (int i =0;i<tam;i++){
     
        System.out.print(sorteo[i]+" ");         
        }   
     System.out.println(" ");
     
     
     
     
        for (int i=0;i<6;i++){
            
            for (int j=0;j<6;j++){
                
                if (arreglo[i]==sorteo[j]){
                  cont = cont +1;  
                  
                }
        }   
}
    
     int iguales[] = new int [cont];
     
      int d= 0;
     
     for (int i=0;i<6;i++){
            
            for (int j=0;j<6;j++){
                
                if (arreglo[i]==sorteo[j]){
                    iguales[d] = arreglo[i];
                    d = d+1;
                }
        }   
}
     
     if (cont<4){
        System.out.println("Tuviste  " + cont + " aciertos, intentalo de nuevo");
        System.out.println("Los numeros iguales son");
        for (int i =0;i<cont;i++){
        System.out.print(iguales[i]+" ");         
        }   
        System.out.println(" ");
        }
     
      if (cont==4){
        System.out.println("Tuviste  " + cont + " aciertos, salvaste la boleta");
        System.out.println("Los numeros iguales son");
        for (int i =0;i<cont;i++){
        System.out.print(iguales[i]+" ");         
        }   
        System.out.println(" ");
     }
     
      if (cont==5){
        System.out.println("Tuviste  " + cont + " aciertos, ganaste");
        System.out.println("Los numeros iguales son");
        for (int i =0;i<cont;i++){
        System.out.print(iguales[i]+" ");         
        }   
        System.out.println(" ");
     }
        
    }
}
     
        
    