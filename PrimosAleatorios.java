/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primosaleatorios;

import java.util.Scanner;

/**
 *
 * @author juanc
 */
public class PrimosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
       
        int cantidad, numero;
        Scanner leer = new Scanner(System.in);
        cantidad = leer.nextInt();
   
        int[] primos= new int[cantidad];
        

        for(int i =0; i<cantidad;i++){

            boolean nuevo=true;
            while(nuevo){
                numero = (int) (Math.random() * 1000) + 1; 
              
              
                 if (comprobadorPrimo(numero)==1){
                    nuevo= false;
                    primos[i]=numero;   
                }
            }
           
            
        }
        int mayor= primos[0];
        for(int i = 0; i< cantidad;i++){
            System.out.print(" " + primos[i]);
            if(primos[i]>mayor){
                mayor=primos[i];
            }
        }
        System.out.println("");  
        System.out.println("El primo mayor es "+ mayor);  
        
        
    }
    
    public static int comprobadorPrimo(int numero){
        int cont=0;
        for(int j=2;j<=numero;j++){
            if(numero%j==0){
               cont++;
               if (cont==2){
                  j=numero;
               }
            }
        }
        return cont;
    }
    
}
