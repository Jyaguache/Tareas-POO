/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.tarea2colecciones;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Jimmy
 */
// Ejecuta la interaccion soliciada.

public class ProcesarColecciones {
    public static void main(String[] args) {
        String opcionMenuPrincipal;
        String opcionMenuInterno;
        
        ArrayList<Fifa22> listaObjetosFifa22 = new ArrayList();
        ArrayList<Jugadores> listaObjetosJugadores = new ArrayList();
        ArrayList<Consolas> listaObjetosConsolas = new ArrayList();
        do {
            System.out.println(">>> Menu principal <<<");
            System.out.println("1.- Opciones de juego Fifa");
            System.out.println("2.- Opciones de jugadores");
            System.out.println("3.- Opciones de consolas");
            System.out.println("0.- Salir");
            Scanner entradaData = new Scanner(System.in);
            System.out.print("Ingrese opción: ");
            opcionMenuPrincipal = entradaData.nextLine();

            if (opcionMenuPrincipal.equals("1")) {
                do {
                    System.out.println("1.- Listar Opciones de Fifa");
                    System.out.println("2.- Ingresar Opciones de Fifa");
                    System.out.println("3.- Buscar Opciones de Fifa");
                    System.out.println("4.- Eliminar Opciones de Fifa");
                    System.out.println("0.- Salir de la opcion");
                    System.out.print("Ingrese opción: ");
                    opcionMenuInterno = entradaData.nextLine();
                    if (opcionMenuInterno.equals("1")) {
                        System.out.println("----------------------------------");
                        System.out.println("Listar Fifa");
                        if (listaObjetosFifa22.isEmpty()) {
                            System.out.println("No hay version de Fifa agregado");
                        } else {
                            for (int i = 0; i < listaObjetosFifa22.size(); i++) {
                               Fifa22 objFifa22 = listaObjetosFifa22.get(i);
                                System.out.println("******************");
                                System.out.println("Fifa: " + i);
                                System.out.println("Nombre: " + objFifa22.getNameGame());
                                System.out.println("Modo de juego: " + objFifa22.getGameMode());
                                System.out.println("Dificultad: " + objFifa22.getDifficulty());
                                System.out.println("Nivel: " + objFifa22.getLevel());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("2")) {
                        System.out.println("----------------------------------");
                        String nameGameFifa22;
                        System.out.print("Ingrese nueva version Fifa: ");
                        nameGameFifa22 = entradaData.nextLine();
                        String gameModeFifa22;
                        System.out.print("Ingrese modo de juego: ");
                        gameModeFifa22 = entradaData.nextLine();
                        String difficultyFifa22;
                        System.out.print("Ingrese la dificultad de juego: ");
                        difficultyFifa22 = entradaData.nextLine();
                        String levelFifa22;
                        System.out.print("Ingrese el nivel de juego: ");
                        levelFifa22 = entradaData.nextLine();

                       Fifa22 objFifa22 = new Fifa22("Fifa", "Deportivo", "Principiante", "Nivel 10");
                        listaObjetosFifa22.add(objFifa22);
                        System.out.println("Nuevo Fifa agregado");
                    }
                    if (opcionMenuInterno.equals("3")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar Fifa");
                        System.out.print("Ingrese el nombre del juego: ");
                        String nameGameFifa22 = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosFifa22.size(); i++) {
                            Fifa22 objFifa22 = listaObjetosFifa22.get(i);
                            if (nameGameFifa22.equals(objFifa22.getGameMode())) {
                                System.out.println("******************");
                                System.out.println("Fifa: " + i);
                                System.out.println("Nombre: " + objFifa22.getNameGame());
                                System.out.println("Modo de juego: " + objFifa22.getGameMode());
                                System.out.println("Dificultad: " + objFifa22.getDifficulty());
                                System.out.println("Nivel: " + objFifa22.getLevel());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("4")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar Fifa");
                        System.out.print("Confirme el nombre del juego: ");
                        String nameGameFifa22 = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosFifa22.size(); i++) {
                            Fifa22 objFifa22 = listaObjetosFifa22.get(i);
                            if (nameGameFifa22.equals(objFifa22.getGameMode())) {
                                System.out.println("*****");
                                listaObjetosFifa22.remove(objFifa22);
                                System.out.println("Juego eliminado");
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("0")) {
                        System.out.println("----------------------------------");
                        System.out.println("Salir de la opcion");
                    }

                } while (!opcionMenuInterno.equals("0"));
            }
            if (opcionMenuPrincipal.equals("2")) {
                do {
                    System.out.println("1.- Listar jugadores");
                    System.out.println("2.- Ingresar jugadores");
                    System.out.println("3.- Buscar jugadores");
                    System.out.println("4.- Eliminar jugadores");
                    System.out.println("0.- Salir de la opcion");
                    System.out.print("Ingrese opción: ");
                    opcionMenuInterno = entradaData.nextLine();
                    if (opcionMenuInterno.equals("1")) {
                        System.out.println("----------------------------------");
                        System.out.println("Listar jugadores");
                        if (listaObjetosJugadores.isEmpty()) {
                            System.out.println("No hay jugadores agregados");
                        } else {
                            for (int i = 0; i < listaObjetosJugadores.size(); i++) {
                                Jugadores objJugadores = listaObjetosJugadores.get(i);
                                System.out.println("******************");
                                System.out.println("Juegador: " + i);
                                System.out.println("NamePlayer: " + objJugadores.getNamePlayer());
                                System.out.println("NickName: " + objJugadores.getNickName());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("2")) {
                        System.out.println("----------------------------------");
                        System.out.println("Ingresar el nombre del jugador");
                        String namePlayer;
                        System.out.print("Ingrese el nombre del juego: ");
                        namePlayer = entradaData.nextLine();
                        String nickeName;
                        System.out.print("Ingrese el apodo: ");
                        nickeName = entradaData.nextLine();
                        Jugadores objJugadores = new Jugadores("Jimbo Y", "Jimbo89");
                        listaObjetosJugadores.add(objJugadores);
                        System.out.println("Jugador creado");
                    }
                    if (opcionMenuInterno.equals("3")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar jugador");
                        System.out.print("Ingrese el nombre: ");
                        String namePlayer = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosJugadores.size(); i++) {
                            Jugadores dato = listaObjetosJugadores.get(i);
                            if (namePlayer.equals(dato.getNamePlayer())) {

                                System.out.println("Jugador encontrado");
                                System.out.println("Jugador: " + i);
                                System.out.println("Nombre: " + dato.getNamePlayer());
                                System.out.println("Apodo: " + dato.getNickName());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("4")) {
                        System.out.println("----------------------------------");
                        System.out.println("Eliminar jugador");
                        System.out.print("Ingrese el nombre: ");
                        String namePlayer = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosJugadores.size(); i++) {
                            Jugadores dato = listaObjetosJugadores.get(i);
                            if (namePlayer.equals(dato.getNamePlayer())) {
                                System.out.println("*****");
                                listaObjetosJugadores.remove(dato);
                                System.out.println("Jugador eliminado");
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("0")) {
                        System.out.println("----------------------------------");
                        System.out.println("Salir de la opcion");
                    }

                } while (!opcionMenuInterno.equals("0"));
            }
             if (opcionMenuPrincipal.equals("3")) {
                do {
                    System.out.println("1.- Listar Consolas");
                    System.out.println("2.- Ingresar Consolas");
                    System.out.println("3.- Buscar Consolas");
                    System.out.println("4.- Eliminar Consola");
                    System.out.println("0.- Salir de la opcion");
                    System.out.print("Ingrese opcion: ");
                    opcionMenuInterno = entradaData.nextLine();
                    if (opcionMenuInterno.equals("1")) {
                        System.out.println("----------------------------------");
                        System.out.println("Listar Consolas");
                        if (listaObjetosConsolas.isEmpty()) {
                            System.out.println("No hay consolas agregados");
                        } else {
                            for (int i = 0; i < listaObjetosConsolas.size(); i++) {
                                Consolas objConsolas= listaObjetosConsolas.get(i);
                                System.out.println("******************");
                                System.out.println("Consola: " + i);
                                System.out.println("Numero de Consola: " + objConsolas.getNumberConsole());
                                System.out.println("Ubicacion de Consola: " + objConsolas.getRoomLocation());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("2")) {
                        System.out.println("----------------------------------");
                        String numberConsole;
                        System.out.print("Ingrese el Numero de Consola: ");
                        numberConsole = entradaData.nextLine();
                        String roomLocation;
                        System.out.print("Ingrese la Ubicacion de Consola: ");
                        roomLocation = entradaData.nextLine();

                        Consolas objConsolas = new Consolas("Consola #1", "Piso 1B");

                        listaObjetosConsolas.add(objConsolas);
                        System.out.println("Consolas agregadas");
                    }
                    if (opcionMenuInterno.equals("3")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar Consolas");
                        System.out.print("Ingrese el # Consola: ");
                        String numberConsole= entradaData.nextLine();
                        for (int i = 0; i < listaObjetosConsolas.size(); i++) {
                            Consolas objConsolas = listaObjetosConsolas.get(i);
                            if (numberConsole.equals(objConsolas.getNumberConsole())) {
                                System.out.println("******************");
                               System.out.println("Consola: " + i);
                                System.out.println("Numero de Consola: " + objConsolas.getNumberConsole());
                                System.out.println("Ubicacion de Consola: " + objConsolas.getRoomLocation());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("4")) {
                        System.out.println("----------------------------------");
                        System.out.println("Eliminar Consola: ");
                        System.out.print("Ingrese el # Consola: ");
                        String numberConsole = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosConsolas.size(); i++) {
                            Consolas objConsolas = listaObjetosConsolas.get(i);
                            if (numberConsole.equals(objConsolas.getNumberConsole())) {
                                System.out.println("*****");
                                listaObjetosConsolas.remove(objConsolas);
                                System.out.println("Consolas eliminadas");
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("0")) {
                        System.out.println("----------------------------------");
                        System.out.println("Salir de la opcion");
                    }

                } while (!opcionMenuInterno.equals("0"));
            }
            if (opcionMenuPrincipal.equals("3")) {
                System.out.println("Salir del programa");
            }

        } while (!opcionMenuPrincipal.equals("4"));

    }

}
