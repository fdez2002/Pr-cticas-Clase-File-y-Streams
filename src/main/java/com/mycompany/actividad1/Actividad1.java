/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.actividad1;

import java.io.File;

/**
 *
 * @author Antonio Muestra una lista de ficheros que hay en ese directorio si
 * dicho directorio esta vacío mostrará un mensaje indicativo.
 */
public class Actividad1 {

    public static void main(String[] args) {
        //Actividad1
        File ruta = new File("G:\\Mi unidad\\DriveClase2ºDAM\\Actividad1");

        if (ruta.exists() == false) {
            System.out.println("Este directorio no existe");
        } else {
            File lista[] = ruta.listFiles();

            for (File lista1 : lista) {
                System.out.println(lista1);
            }
        }

    }
}
