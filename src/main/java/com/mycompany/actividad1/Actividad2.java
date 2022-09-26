/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad1;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Antonio
 */
public class Actividad2 {

    public static void main(String[] args) {
        Lectura_Fichero apertura = new Lectura_Fichero();

        apertura.leerFichero();
    }

}

class Lectura_Fichero {

    //Metodo donde localizamos el archivo a leer
    public void leerFichero() {
        //El constructor lanza una excepciñon de IOEXCEPTION
        try {
            FileReader fichero = new FileReader("actividad2.txt"); //Constructor

            int a = fichero.read(); //Almacena el codigo del primer caracter del fichero

            while (a != -1) {//Se activa mientras while no ha llegado al final del texto
                a = fichero.read();//Guarda de nuevoo el caracter que va detectando

                char letra = (char) a; //Nos transforma los codigos a su correspondiente caracter

                System.out.print(letra);

            }

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo" + ex);
        }
    }
}
