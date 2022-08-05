/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.tarea2colecciones;

/**
 *
 * @author Jimmy
 */
// Clase Jugadores, define los nombres y apodos de los jugadores.
public class Jugadores {
    //Atributos
    private String namePlayer;
    private String nickName;
    
    //Constructores
    public Jugadores(String namePlayer, String nickName) {
        this.namePlayer = namePlayer;
        this.nickName = nickName;
        System.out.println(">>> Datos del jugador: <<<");
    }
    
    //Metodos
    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
  
}
    