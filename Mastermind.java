/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjerciciosJAVA_DAM;

import java.util.Scanner;

/**
 *
 * @author jcmiranda
 * El mastermind es un juego de tablero que consiste en averiguar una combinación de 4 colores. 
 * El jugador dispondrá de 10 oportunidades para averiguar la combinación, en caso de no averiguarla en estos intentos perderá la partida.

En cada turno el jugador indicará una combinación de cuatro colores y el juego le devolverá el número de MUERTOS y de HERIDOS. Muertos son los colores que ha acertado y que se encuentran en su posición y heridos los que ha acertado pero que no se encuentran en su posición.

Existen 6 posibles colores y pueden repetirse: ROJO, AZUL, VERDE, AMARILLO, NARANJA y BLANCO

Por ejemplo:

El ordenador obtiene la combinación aleatoria: ROJO - NARANJA - AMARILLO - AZUL

    ROJO - ROJO - AZUL - VERDE --> 1 Muerto 1 Herido
    NARANJA - ROJO - VERDE - VERDE --> 0 Muertos 2 Heridos
    ROJO - VERDE - NARANJA - AMARILLO --> 1 Muerto 2 Heridos
    AZUL - AMARILLO - ROJO - NARANJA --> 0 Muertos 4 Heridos
    ROJO - NARANJA - AMARILLO - AZUL --> 4 Muertos 0 Heridos

GANASTE
________________________________________________________________
Al comenzar la partida el ordenador deberá crear de forma aleatoria una combinación de 4 colores. No deben repetirse.

La combinación no debe mostrarse nunca, a no ser que el jugador haya ganado o que haya agotado todas las posibilidades
* y por tanto haya perdido. En ese caso se mostrará la combinación oculta.

Se debe utilizar métodos
Se debe tener un control TOTAL sobre las entradas del usuario
No pueden haber excepciones en cuanto al manejo de los vectores y matrices.
 * 
 */
public class Mastermind {
    
    public static void main (String[] arg){
        
        Scanner leer = new Scanner(System.in);



        String[] colores = {"ROJO","AZUL","VERDE","AMARILLO","NARANJA","BLANCO"};
        int[] vecAleatoria = new int [4];
        int[] vecJugador = new int [4];
        for(int i=0;i<vecAleatoria.length;i++){
            vecAleatoria[i] = (int) (Math.random() * 5);
        } 

        comprobar(vecAleatoria);
        
        int intentos=10;
        for(int i = 0; i<4;i++){
                    System.out.print(colores[vecAleatoria[i]] +" ");
                } 
        System.out.println("Comienza el juego, Mucha Suerte!!");
        System.out.println("Ingrese los valores separados por un espacio (ejem: 1 5 2 4)");
        System.out.println("Opciones a escoger ");
   
        while(intentos>0){
            int heridos=0, muertos=0;
            if(intentos<10){
                System.out.println("CASI!...  te quedan "+intentos +" intentos");
            }
                System.out.println("0.- ROJO");
                System.out.println("1.- AZUL");
                System.out.println("2.- VERDE");
                System.out.println("3.- AMARILLO");
                System.out.println("4.- NARANJA");
                System.out.println("5.- BLANCO");
                System.out.println("Debe ingresar solo valores  de 0 a 5, si te equivocas te quito 1 intento ;) ");
            boolean ValCorrectos=true;
            for(int i=0; i <4;i++){
                
                vecJugador[i]= leer.nextInt();
                if(vecJugador[i] >5 || vecJugador[i] <0 ){
                    System.out.println("Te equivocaste al ingresar el valor "+ vecJugador[i]);
                    intentos--;
                    ValCorrectos= false;
                }
                
            }
            
                
            if(ValCorrectos==true) {
            
                for(int i=0; i <4;i++){
                    for(int j=0;j<4;j++){
                        if(vecAleatoria[j]==vecJugador[i] && i==j){
                            muertos+=1;
                        }
                        if(vecAleatoria[j]==vecJugador[i] && i!=j ){
                            heridos+=1;
                        }
                    }
                }

                System.out.println( colores[vecJugador[0]]+" - "+colores[vecJugador[1]]+" - "+colores[vecJugador[2]]+" - "+ colores[vecJugador[3]] +" --> "+ muertos+" Muertos "+heridos+" Heridos");
                System.out.println("--------------------------------------------------------"); 
                intentos--;
                
            }
            if(intentos ==0){
                System.out.println("Perdiste! la maquina Gano, la opcion correcta era: ");
                for(int i = 0; i<4;i++){
                    System.out.print(colores[vecAleatoria[i]] +" ");
                } 
            }
            if(muertos ==4){
                
                System.out.println("Opcion Ganadora del Jugador: ");
                for(int i = 0; i<4;i++){
                    System.out.print(colores[vecJugador[i]] +" ");
                } 
                System.out.println("");
                System.out.println("Opcion Aleatoria de la Maquina : ");
                for(int i = 0; i<4;i++){
                    System.out.print(colores[vecAleatoria[i]] +" ");
                } 
                intentos=0;
            }
            
        }
        

      
      
    } 
    public static boolean comprobar(int[] vecAleatoria) { 
        boolean stateVec = true; 
        outerLoop: 
        while (stateVec) { 
            for (int j = 0; j < vecAleatoria.length; j++) { 
                for (int i = 0; i < vecAleatoria.length; i++) { 
                    if (j != i && vecAleatoria[j] == vecAleatoria[i]) { 
                         
                        if (vecAleatoria[i] + 1 > 6) { 
                            vecAleatoria[i] = 0; 
                        } 
                        else { 
                            vecAleatoria[i] = vecAleatoria[i] + 1; 
                        } 
                        continue outerLoop; 
                    } 
                } 
            } 
            stateVec = false; 
        } 
        return stateVec; 
    }
       
}

