/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package año;

/**
 *
 * @author angel
 */


 import java.util.Scanner;
import java.util.Random;

public class Año{

    public static void main (String[] args) {
        System.out.println("Adivina el mes secreto");
        pedirMes();
    }

    public static void pedirMes() {
        String[] mesesAño = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        Random numeroRandom = new Random(); 
        int mesSecreto = numeroRandom.nextInt(12); //asignamos numero aleatorio a mesSecreto
        Scanner miScanner;
        System.out.println("\nIngresa un mes");
        miScanner = new Scanner(System.in);
        
        while (!miScanner.nextLine().equalsIgnoreCase(mesesAño[mesSecreto])) {
            System.out.println("Incorrecto, intenta de nuevo ingresando otro mes");
            miScanner = new Scanner(System.in);
        }
        System.out.println("Correcto!");
        System.out.println("\nFin de programa");
    }
}
    
    

