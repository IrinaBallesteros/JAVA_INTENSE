package org.java.intense;

import javax.swing.*;

public class SentenciaForArreglos {

    public static void main(String[] args) {

        String[] nombres = {"Irina", "Pepe", "Maria", "Paco", "Juliana", "Isabella", "Julio", "Camila"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if (nombres[i].toLowerCase().contains("IRINA".toLowerCase()) ||
                    nombres[i].toUpperCase().contains("isabella".toUpperCase())) {
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\": ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }
    }
}
