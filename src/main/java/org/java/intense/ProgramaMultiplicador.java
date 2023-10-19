
/* Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de
multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos
es positivo. */

package org.java.intense;

import java.util.Scanner;

public class ProgramaMultiplicador {

    public static void main(String[] args) {

        Scanner multi = new Scanner(System.in);

        System.out.println("Ingrese el numero X: ");
        int x = multi.nextInt();

        System.out.println("Ingrese el numero Y: ");
        int y = multi.nextInt();

        int multiplicacion = 0;

        boolean positivoX = x > -1;
        boolean positivoY = y > -1;

        int absolutoX = positivoX? x: -x;

        for (int i = 0; i < absolutoX; i++) {
            multiplicacion = multiplicacion + y;
        }
        if ((!positivoX && !positivoY) || !positivoX){
            multiplicacion = -multiplicacion;
        }
        System.out.println("el resultado de la multiplicacion es " + multiplicacion);
    }
}
