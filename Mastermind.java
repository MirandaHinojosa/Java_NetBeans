/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjerciciosJAVA_DAM;

/**
 *
 * @author jcmiranda
 * El mastermind es un juego de tablero que consiste en averiguar una combinación de 4 colores. El jugador dispondrá de 10 oportunidades para averiguar la combinación, en caso de no averiguarla en estos intentos perderá la partida.

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

La combinación no debe mostrarse nunca, a no ser que el jugador haya ganado o que haya agotado todas las posibilidades y por tanto haya perdido. En ese caso se mostrará la combinación oculta.

Se debe utilizar métodos
Se debe tener un control TOTAL sobre las entradas del usuario
No pueden haber excepciones en cuanto al manejo de los vectores y matrices.
 * 
 */
public class Mastermind {
    
    public static void main (String[] arg){
        

        
        
       
        String[] colores = {"ROJO","AZUL","VERDE","AMARILLO","NARANJA","AZUL"};
        
       
    }
    
}
