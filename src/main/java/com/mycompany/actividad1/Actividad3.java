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
 */
public class Actividad3 {

    public static void main(String[] args) {

        Ejecucion ejecucion = new Ejecucion();
        ejecucion.menu();
    }
}

class Ejecucion {

    Scanner sc = new Scanner(System.in);
    int opcion;

    //Menu del programa
    public void menu() {
        System.out.println(" ");
        System.out.println("Elige una opción");
        System.out.println("1--Creación de un fichero de texto");
        System.out.println("2--Mostrar el contenido del fichero");
        System.out.println("3--Salir del programa");

        opcion = sc.nextInt();

        opciones();
    }

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

    //Crea el fichero y deja introducir los distintos datos
    public void crearFichero() {
        try ( FileWriter entrada = new FileWriter("actividad2.txt", true)) {

            System.out.println("Nombre");
            entrada.write(sc.nextLine());

            System.out.println("Apellidos");
            entrada.write(sc.nextLine());
            entrada.write("\n");

            System.out.println("Lugar de nacimiento");
            entrada.write(sc.nextLine());

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo" + ex);

        }
    }

    //Nos deja ver el contenico del fichero
    public void mostrarFichero() {
        try {
            FileReader salida = new FileReader("G:\\Mi unidad\\DriveClase2ºDAM\\Actividad1\\actividad2.txt");

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
