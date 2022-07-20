/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.herencias;

/**
 *
 * @author Jimmy
 */
public class Juegos {
    //Crea atributos
    private String namegame;
    private String difficulty;
    
    // Crea constructores
    public Juegos(String namegame, String difficulty) {
        this.namegame = namegame;
        this.difficulty = difficulty;
    }

    // Insertar Get
    public String getNamegame() {
        return namegame;
    }

    public String getDifficulty() {
        return difficulty;
    }
    

}