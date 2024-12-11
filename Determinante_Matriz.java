/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjerciciosJAVA_DAM;

import java.util.Scanner;

/**
 *
 * @author jcmiranda
 * 
 * Ejercicio: Escribir un programa que calcule el determinante de una matriz de 3x3. 
 * Pruébelo con la matriz [ [1,2,3], [4,5,6], [7,8,8] ] cuyo determinante es 3.

    𝐴=[𝑎 𝑏 𝑐]
      [𝑑 𝑒 𝑓]
      [𝑔 ℎ 𝑖]

    *   B=[1 2 3]
    *     [4 5 6]
    *     [7 8 8]
    * (1*5*8)+(2*6*7)+(3*4*8)-(1*6*8)-(2*4*8)-(3*5*7)
    𝑑𝑒𝑡𝐴=𝑎𝑒𝑖+𝑏𝑓𝑔+𝑐𝑑ℎ−𝑎𝑓ℎ−𝑏𝑑𝑖−𝑐𝑒𝑔
 */
public class Determinante_Matriz {
    
    public static void main (String[] arg){
        Scanner leer = new Scanner(System.in);
        int matriz[][]= new int [3][3];
        int diaDe,diaIz;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Ingrese valor en la posicion Matriz["+ i+"]["+j+"]");
                matriz[i][j]= leer.nextInt();
            }
        }
         for(int i=0;i<3;i++){
             
            for(int j=0;j<3;j++){
                System.out.print (matriz[i][j] +" " ); 
            }
            System.out.println("");
        }
        diaDe= (matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[0][1]*matriz[1][2]*matriz[2][0])+(matriz[0][2]*matriz[1][0]*matriz[2][1]);
        diaIz=((matriz[0][0]*matriz[1][2]*matriz[2][1])+(matriz[0][1]*matriz[1][0]*matriz[2][2])+(matriz[0][2]*matriz[1][1]*matriz[2][0]));
        
        
        System.out.println("El determinante es "+(diaDe-diaIz));
        
    }
    
    
    
    
}
