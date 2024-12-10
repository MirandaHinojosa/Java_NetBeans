/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.EjerciciosJAVA_DAM;

import java.util.Scanner;

/**
 *
 * @author jcmiranda
 * 
 * Programa Java para leer la altura de N personas y calcular la altura media. 
 * Calcular cuántas personas tienen una altura superior a la media y cuántas tienen
 * una altura inferior a la media. El valor de N se pide por teclado y debe ser entero 
 * positivo.
 * 
 */
public class AlturaMedia {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int alturas[];
        
        int cantidad,MasMedia=0,MenosMedia=0, suma=0;
        double media;
        cantidad  = leer.nextInt();
        alturas = new int[cantidad];
        
        for(int i =0;i<cantidad;i++){
            System.out.println("ingrese altura nro. "+ (i+1));
            alturas[i] =leer.nextInt();
            suma+=alturas[i];
        }
        media= suma/cantidad;
        for(int i =0;i<cantidad;i++){
            System.out.print(alturas[i]+" ");
            if(alturas[i]>media)
                MasMedia+=1;
            
            if(alturas[i]<media)
                MenosMedia+=1;
            
        }
        System.out.println("La media es "+ media);
        System.out.println("Por encima de la media hay: "+ MasMedia);
        System.out.println("Por debajo de la media hay: "+ MenosMedia);
    }
}
