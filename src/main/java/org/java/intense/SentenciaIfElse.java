package org.java.intense;
public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 8.6f;

        if (promedio >= 8.0) {
            System.out.println("Felicitaciones, excelente promedio!");
        } else if (promedio >= 6.0){
            System.out.println("Buen promedio!");
        } else if (promedio >= 5.0) {
            System.out.println("Necesitas esforzarte un poco mas!");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar mas!");
        } else {
            System.out.println("Reprobado");
        }

        System.out.println("tu promedio es = " + promedio);
    }
}
