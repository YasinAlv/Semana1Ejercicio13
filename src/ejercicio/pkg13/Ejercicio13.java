/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio13 {

    /**
     * Realiza una aplicación que nos pida un número de ventas a introducir,
     * después nos pedirá tantas ventas por teclado como número de ventas se
     * hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que
     * es lo que se repite y lo que no.
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int Cantidad, Suma = 0;

        System.out.println("Digite el número de ventas: ");
        Cantidad = Teclado.nextInt();

        for (int i = 1; i <= Cantidad; i++) {
            
            int dato;
            System.out.println("Digite el monto: ");
            dato = Teclado.nextInt();
            Suma = Suma + dato;
        }
        System.out.println("La sumatoria del numero de ventas es de: " +Suma);
    }
}
