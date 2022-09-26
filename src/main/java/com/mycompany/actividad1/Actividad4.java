/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Antonio 
 * Realiza un programa en JAVA en el que muestres un menú que te
 * permita 3 opciones: 1. Volcado de un array con los 100 primeros números pares
 * a un fichero de texto. El nombre del fichero lo elegirá el usuario. 2.
 * Mostrar por pantalla el contenido del fichero de texto creado. 3. Salir del
 * Programa.
 */
public class Actividad4 {

    public static void main(String[] args) {

        Procesos proceso = new Procesos();
        proceso.menu();
    }
}

class Procesos {

    Scanner sc = new Scanner(System.in);
    Scanner fichero = new Scanner(System.in);
    int opcion;
    String nombrefichero = null;

    //Menu del programa
    public void menu() {
        System.out.println(" ");
        System.out.println("Elige una opción");
        System.out.println("1--Volcado de los 100 primero numeros pares a un fichero de texto");
        System.out.println("2--Mostrar el contenido del fichero");
        System.out.println("3--Salir del programa");

        opcion = sc.nextInt();
        opciones();

    }
    //Redirige a las distintos metodos
    public void opciones() {

        switch (opcion) {

            case 1 -> {

                crearFichero();
                menu();

            }

            case 2 -> {

                mostrarFichero();
                menu();
            }
            case 3 -> {

                System.exit(0);
            }

        }
    }
    //Crea un fichero
    public void crearFichero() {

        System.out.println("Nombre del fichero");

        nombrefichero = fichero.nextLine();//Guardamos el nombre que el usuario indique

        try ( FileWriter entrada = new FileWriter(nombrefichero)) {//Creamos el fichero con el nombre del usuario

            for (int numeros = 1; numeros <= 100; numeros++) {
                if (numeros % 2 == 0) {
                    String cadenaNumeros = String.valueOf(numeros);
                    entrada.write(cadenaNumeros + "\n");
                }

            }

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo" + ex);

        }
    }
    //Nos mustra el contenido del fichero
    public void mostrarFichero() {
        try {
            FileReader salida = new FileReader(nombrefichero);

            int a = salida.read(); //Lee el fichero en entero mostrando el -1 al final de la frase

            while (a != -1) {
                a = salida.read();

                char letra = (char) a; //Nos transforma los codigos a su correspondiente caracter

                System.out.print(letra);
            }
        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo" + ex);
        }

    }

}
