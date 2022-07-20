/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.herencias;

/**
 *
 * @author Jimmy
 */
public class Fifa22 extends Juegos{
    //Fifa hereda de clase Juegos

    private String modoJuego;
    private String nivel;
    
    public Fifa22 (String namegame, String difficulty, String modoJuego, String nivel){
    super(namegame, difficulty);
    this.modoJuego = modoJuego;
    this.nivel = nivel;
    
    }

    public void mostrarInf (){
        System.out.println("Nombre de juego: "+getNamegame()+
                "\nDificultad: "+getDifficulty()+
                "\nModo de juego: "+modoJuego+
                "\nNivel de juego: "+nivel);
    }

}