package org.java.intense;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter );
        System.out.println("decimal = " + decimal );
        System.out.println("decimal = carcater: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte a " + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("char corresponde en bites " + Character.SIZE);
        System.out.println("character.MIN_VALUE " + Character.MAX_VALUE);
        System.out.println("character.MAX_VALUE " + Character.MIN_VALUE);


    }

}
