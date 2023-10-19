/* Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el
promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los
cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando
el programa. */


package org.java.intense;

import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);

        double nota;
        int contNotas1 = 0;
        int contNotasMayoresA5 = 0;
        int contNotasMenoresA4 = 0;
        double sumaNotasMayoresA5 = 0;
        double sumaNotasMenoresA4 = 0;
        double sumaTotal = 0;

        double promedioNotasMayoresA5, promedioNotasMenoresA4;

        boolean error = false;

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
            nota = notas.nextDouble();

            if (nota == 0) {
                error = true;
                break;
            }

            if (nota == 1) {
                contNotas1++;
            } else {
                if (nota > 5) {
                    contNotasMayoresA5++;
                    sumaNotasMayoresA5 += nota;
                } else if (nota < 4) {
                    contNotasMenoresA4++;
                    sumaNotasMenoresA4 += nota;
                }
        }
            sumaTotal += nota;
    }

    if (error) {
        System.err.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecucion del programa");
        System.exit(1);
    }
    System.out.println("La cantidad de notas en 1 son: " + contNotas1);

    if(contNotasMayoresA5 == 0){
        System.out.println("No se puede calcular el promedio de notas sobre 5");
    } else {
    promedioNotasMayoresA5=sumaNotasMayoresA5/contNotasMayoresA5;
    System.out.println("Promedio de notas mayores a 5: "+promedioNotasMayoresA5);
    }

    if(contNotasMenoresA4 == 0) {
        System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
            System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
        }

        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
    }
}




