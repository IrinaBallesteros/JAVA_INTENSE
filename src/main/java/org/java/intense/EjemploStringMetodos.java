package org.java.intense;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Irina";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Irina"));
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("irina"));
        System.out.println("nombre.equalsIgnoreCase(\"irina\") = " + nombre.equalsIgnoreCase("irina"));
        System.out.println("nombre.compareTo(\"Irina\") = " + nombre.compareTo("Irina"));
        System.out.println("nombre.compareTo(\"Juliana\") = " + nombre.compareTo("Juliana"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(4, 5) = " + nombre.substring(4, 5));
        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        System.out.println("nombre.substring(nombre.length() -2) = " + nombre.substring(nombre.length()-2));


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", ","));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.contains('lenguas') = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWit(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());

    }
}