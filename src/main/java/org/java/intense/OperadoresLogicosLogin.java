package org.java.intense;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

      /*  String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Irina";
        passwords[0] = "123456";

        usernames[1] = "Admin";
        passwords[1] = "12345";

        usernames[2] = "Pepe";
        passwords[2] = "12345";*/

        String[] usernames = {"Irina", "Admin", "Pepe"};
        String[] passwords = {"123456", "12345", "123"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese su password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;


            /*if ((usernames[i].equals(u) && passwords[i].equals(p))) {
                esAutenticado = true;
                break;
            }*/
        }


        String mensaje = esAutenticado ? "Bienvenido Usuario " .concat(u).concat("!") :
                "Username o contrasena incorrectas! \nLo sentimos, requiere autenticacion";
        System.out.println("mensaje = " + mensaje);

       /* if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
                System.out.println("Username o contrasena incorrecto!");
                System.out.println("Lo siento, requiere autenticacion");
        }*/
    }
}

