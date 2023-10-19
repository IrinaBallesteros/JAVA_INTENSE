/*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la
clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces
(ingresado) para pedir el numero entero, entonces se requiere:

Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es
igual o mayor que 10!". */

package org.java.intense;

import java.util.Scanner;

public class DetectorNumeroInferior {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.println(" Registre la cantidad de numeros que desea clasificar: ");
        int cantidad = n.nextInt();

        if (cantidad < 10) {
            System.out.println("Registro invalido: debe ingresar minimo 10 numeros!");
        } else {
            int inferior = Integer.MAX_VALUE;
            int dato;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                dato = n.nextInt();
                inferior = (dato < inferior) ? dato : inferior;
            }
            System.out.println("El numero inferior es: " + inferior);

            if (inferior < 10) {
                System.out.println("El numero " + inferior + " esta por debajo de 10!");
            } else {
                System.out.println("El numero " + inferior + " es igual o mayor al numero 10!");
            }
        }
    }
}
