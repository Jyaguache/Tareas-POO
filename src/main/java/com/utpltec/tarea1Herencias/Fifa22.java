/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.tarea1Herencias;

/**
 *
 * @author Jimmy
 */
public class Fifa22 extends Juegos{
    //La clase hija Fifa22 hereda de clase Juegos

    private String difficulty;
    private String level;
    
    //Constructores
    public Fifa22 (String nameGame, String gameMode, String difficulty, String level){
    super(nameGame, gameMode);
    this.difficulty = difficulty;
    this.level = level;
    }

    public void mostrarInf (){
        System.out.println(">>> Datos del juego: <<<"+
                "\nNombre: "+getNameGame()+
                "\nModo de juego: "+getGameMode()+
                "\nDificultad: "+difficulty+
                "\nNivel de juego: "+level);
    }

}