/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Antonio
 * Realiza un programa en JAVA que lea un archivo creado en el bloc de notas llamado numeros.txt 
 * que contiene varias líneas y en cada una de ellas un número. Luego, el programa te dará la suma 
 * de todos los números del fichero.
 */
public class Actividad6 {

    public static void main(String[] args){

        Ejercicio ejer = new Ejercicio();

        ejer.suma();
    }

}

class Ejercicio {
    
    //Metodo que accede al fichero numeros.txt y realiza la suma 
    public void suma(){

        Scanner fichero = null;//Lee los datos del fichero

        try {
            fichero = new Scanner(new File("numeros.txt"));
            

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo" + ex);

        }

        int numero = 0; //Guarda los numero que va capturando
        int contador = 0;//Almacena el resulatado de la suma
        
        //Permite leer todos los numero del fichero
        //has.Next nos devuelve un boolean, si devuelve true sigue leyendo los numeros de delante, si es false termina el ciclo
        
        while (fichero.hasNext()) {
            numero = fichero.nextInt();
            contador += numero;
        }
        System.out.println("La suma total es: " + contador);

    }

}
