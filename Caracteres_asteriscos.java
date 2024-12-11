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
 * Ejercicio: Escriba un programa que lea de la entrada un número y utilice ese número para crear un 
 * array de enteros de ese tamaño. A continuación, el programa inicializará el array con los valores que 
 * el usuario introduzca por la entrada. Finalmente, se deberá recorrer el array e imprimir tantos 
 * caracteres ‘*’ como indique el valor de cada elemento del array.

Ejemplo: los valores 5,4,3,2 producirán la siguiente salida:

*****

****

***

**
 * 
 * 
 */
public class Caracteres_asteriscos {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int vec[];
        int cant;
        cant = leer.nextInt();
        vec= new int[cant];
        
        for(int i =0;i<cant;i++){
            System.out.println("Ingrese dato nro. "+(i+1));
            vec[i]= leer.nextInt();
        }
        
        System.out.println("capturas correctas ");
        for(int j =0;j<vec.length;j++){
            System.out.println("");
            for(int k = 0;k<vec[j];k++){
                System.out.print("*");
            }
        }
        
        
    }
}
