package org.java.intense;

public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3;
        System.out.println("d = " + d);

        float f = 12345e2f;
        System.out.println("f = " + f);

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
