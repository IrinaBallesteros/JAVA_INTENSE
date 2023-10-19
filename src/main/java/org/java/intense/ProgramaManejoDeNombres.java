package org.java.intense;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Registra el nombre de un familiar: ");
        String nombreX = scanner.nextLine();
        String nombreXY = nombreX.toUpperCase().charAt(1) + "." + nombreX.substring(nombreX.length()-2);

        System.out.println("Registra el nombre de un familiar: ");
        String nombreY = scanner.nextLine();
        String nombreYX = nombreY.toUpperCase().charAt(1) + "." + nombreY.substring(nombreY.length()-2);

        System.out.println("Registra el nombre de un familiar: ");
        String nombreZ = scanner.nextLine();
        String nombreZX = nombreZ.toUpperCase().charAt(1) + "." + nombreZ.substring(nombreZ.length()-2);

        String Apodo = "El Apodo es = " + nombreXY + "_" + nombreYX + "_" + nombreZX;
        System.out.println(Apodo);
    }
}
