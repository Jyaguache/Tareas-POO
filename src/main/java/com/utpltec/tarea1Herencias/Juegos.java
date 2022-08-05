/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.tarea1Herencias;

/**
 *
 * @author Jimmy
 */
// Clase Juegos, define los videojuegos disponibles y el modo de juego.
public class Juegos {
    //Atributos
    private String nameGame;
    private String gameMode;
    
    //Constructores
    public Juegos(String nameGame, String gameMode) {
        this.nameGame = nameGame;
        this.gameMode = gameMode;
    }

    //Metodos
    public String getNameGame() {
        return nameGame;
    }
    public void setNameGame(String nameGame) {
        this.nameGame = nameGame;
    }
    
    public String getGameMode() {
        return gameMode;
    }
    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

}