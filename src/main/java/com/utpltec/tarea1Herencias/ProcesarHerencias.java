/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.tarea1Herencias;

/**
 *
 * @author Jimmy
 */
// Ejecuta el informe solicitado.
public class ProcesarHerencias {
    public static void main(String[] args) {
        //Imprime informacion de clase Juegos e hija Fifa22
        Fifa22 fifa22 = new Fifa22("Fifa22", "Deportivo", "Principiante", "Nivel 10");
        fifa22.mostrarInf();
       
        //Imprime informacion de clase jugadores
        Jugadores jugadores1 = new Jugadores("Jimmy Y", "Jimbo89");
        System.out.println("Nombre: " + jugadores1.getNamePlayer() +
                "\nApodo: "+jugadores1.getNickName());
        
        //Imprime informacion de clase Consoldas de juegos
        Consolas consolas1 = new Consolas("Consola #1", "Piso 1B");
        System.out.println("Núm. Equipo: "+ consolas1.getNumberConsole() +
                "\nUbicación: "+consolas1.getRoomLocation());
        
}
}