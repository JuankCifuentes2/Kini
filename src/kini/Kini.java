/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kini;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "Bienvenido, estas listo para jugar? . Recuerda elegir 6 numeros del 0 al 45");
        //Se pide Ingresar numero
        while (m<6){
        aux=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tu numero " + (m+1) ));
        //Se evalua que este entre 0 y 45
        if(aux>45||aux<0){   
        JOptionPane.showMessageDialog(null, "ERROR Recuerda que el numero debe estar entre 0 y 45");
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
          JOptionPane.showMessageDialog(null, "El numero " + aux + " ya lo elegiste ");     
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

        n=0;
        JOptionPane.showMessageDialog(null, "Los numeros que elegiste fueron" + " " + arreglo[n]+" - "+ arreglo[n+1]+" - "+ arreglo[n+2]+" - "+ arreglo[n+3]+" - "+ arreglo[n+4]+" - "+ arreglo[n+5]);        
       
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
        n=0;
        JOptionPane.showMessageDialog(null, "Los numeros sorteados fueron" + " " + sorteo[n]+" - "+ sorteo[n+1]+" - "+ sorteo[n+2]+" - "+ sorteo[n+3]+" - "+ sorteo[n+4]+" - "+ sorteo[n+5]);
     
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
   if (cont==0){
        JOptionPane.showMessageDialog(null, "No le pegaste a ningun numero, intentalo de nuevo");
       }
    
     if (cont==1){
         n=0;
        JOptionPane.showMessageDialog(null, "Acertaste un numero" + " el " + sorteo[n]);
       }
     
     if (cont==2){
         n=0;
        JOptionPane.showMessageDialog(null, "Acertaste 2 numeros " + sorteo[n] + " - "+ sorteo[n+1]);
       } 
     
      if (cont==3){
         n=0;
        JOptionPane.showMessageDialog(null, "Acertaste 3 numeros " + sorteo[n] + " - "+ sorteo[n+1]+ " - "+ sorteo[n+2]);
       } 
      if (cont==4){
         n=0;
        JOptionPane.showMessageDialog(null, "Acertaste 4 numeros salvaste la boleta " + sorteo[n] + " - "+ sorteo[n+1]+ " - "+ sorteo[n+2]+ " - "+ sorteo[n+3]);
       } 
      if (cont==5){
         n=0;
        JOptionPane.showMessageDialog(null, "Acertaste 5 numeros te ganas 3 millones con los numeros " + sorteo[n] + " - "+ sorteo[n+1]+ " - "+ sorteo[n+2]+ " - "+ sorteo[n+3]+ " - "+ sorteo[n+4]);
       } 
      if (cont==6){
         n=0;
        JOptionPane.showMessageDialog(null, "Ganaste el premio Mayor " + sorteo[n] + " - "+ sorteo[n+1]+ " - "+ sorteo[n+2]+ " - "+ sorteo[n+3]+ " - "+ sorteo[n+4]+ " - "+ sorteo[n+5]);
       } 
        
    }
}
     
        
    