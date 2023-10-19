package org.java.intense;

import java.util.Scanner;

public class DetalleDeFactura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Ingrese el nombre de la factura");
            String nombre = scanner.nextLine();

            System.out.println("Registre el precio del producto");
            double precio1 = scanner.nextDouble();

            System.out.println("Registro el precio del segundo producto");
            double precio2 = scanner.nextDouble();

            double totalBruto = precio1 + precio2;
            double impuesto = totalBruto * (0.19);
            double totalNeto = totalBruto + impuesto;

            ;

            String detalle = "La factura " + nombre + " con un total bruto de " + totalBruto
                    + ", con un impuesto de " + impuesto
                    + " y un monto luego de impuesto de " + totalNeto;

            System.out.println(detalle);
        }
    }

