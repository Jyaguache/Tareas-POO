/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.tarea1Herencias;

/**
 *
 * @author Jimmy
 */
// Clase consolas, define cantidad de equipos y el lugar donde se encuentran en el local.

public class Consolas {
    //Atributos
    private String numberConsole;
    private String roomLocation;
    
    //Constructores
    public Consolas(String numberConsole, String roomLocation) {
        this.numberConsole = numberConsole;
        this.roomLocation = roomLocation;
        System.out.println(">>> Datos del equipo: <<<");
    }
    
    //Metodos
    public String getNumberConsole() {
        return numberConsole;
    }

    public void setNumberConsole(String numberConsole) {
        this.numberConsole = numberConsole;
    }

    public String getRoomLocation() {
        return roomLocation;
    }

    public void setRoomLocation(String roomLocation) {
        this.roomLocation = roomLocation;
    }
}