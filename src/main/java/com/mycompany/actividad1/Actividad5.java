/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Antonio Crea una aplicación donde pidamos el nombre de un fichero por
 * teclado y un texto que queramos escribir en el fichero. Después de crear el
 * fichero con la información introducida, deberás mostrar por pantalla e texto
 * del fichero pero variando entre mayúsculas y minúsculas. • Por ejemplo, si
 * escribo: “Bienvenidos a Plasencia” deberá devolver “bIENVENIDOS A pLASENCIA”.
 */
public class Actividad5 {

    public static void main(String[] args) {

        Fichero fichero = new Fichero();
        fichero.crearFichero();
    }
}

class Fichero {

    String nombrefichero = null;
    String texto;
    Scanner fichero = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    //Este metodo crear un fichero con el nombre que el usuario ponga y nos guarada 
    //el texto que introducirá el usuario alternando mayusculas y minusculas
    public void crearFichero() {

        System.out.println("Nombre del fichero");

        nombrefichero = fichero.nextLine();//Guardamos el nombre del fichero introducido por el usuario
        
        //Con la ayuda de FileWriter lo creamos
        try ( FileWriter entrada = new FileWriter(nombrefichero)) {

            System.out.println("Texto");
            texto = sc.nextLine();//Introduce el texto que quiere que se almacene
            
            for (int i = 0; i < texto.length(); i++) {//Recorremos el texto caracter a caracter y dependiendo el valor par o impar asi lo almcena
                if (i % 2 == 0) {
                    entrada.write((texto.charAt(i) + "").toUpperCase());//Guarda el caracter mayuscula
                } else {
                    entrada.write((texto.charAt(i) + "").toLowerCase());//Guarda el caracter minuscula
                }
            }

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo" + ex);

        }
    }

}
