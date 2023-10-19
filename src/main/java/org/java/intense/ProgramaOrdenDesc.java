package org.java.intense;

import java.util.Scanner;

public class ProgramaOrdenDesc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Registre el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Registre el segundo numero: ");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2)? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("Los numeros se presentan en el siguiente orden: " + resultado);



/*import java.util.*;

public class ProgramaOrdenDesc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Registre el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Registre el segundo numero: ");
        int num2 = scanner.nextInt();

        String resultado = ((num1 == 1 || num2 == 1) || (num1 + num2 == 1)) ? "true" : "false";
        System.out.println("El resultado es: " + resultado);*/

    }

}


