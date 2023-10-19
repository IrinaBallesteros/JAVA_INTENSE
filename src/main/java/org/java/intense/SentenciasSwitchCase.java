package org.java.intense;

import java.util.Scanner;

public class SentenciasSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes entre 1 - 12:");

        int mes = s.nextInt();
        String nombreMes = null;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";

        }

        System.out.println("nombreMes = " + nombreMes);

        /*

        char num = 9;
        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
        }

        String nombre = "Juliana";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, Bienvenida!");
                break;
            case "Irina":
                System.out.println("Hola Irina, Bienvenida!");
                break;
            case "Pepe":
                System.out.println("Bienvenido Pepa!");
                break;
            default:
                System.out.println("Usuario desconocido");*/
        }
    }

