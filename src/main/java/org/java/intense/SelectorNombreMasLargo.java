package org.java.intense;

import javax.swing.*;

public class SelectorNombreMasLargo {
    public static void main(String[] args) {

        String familiar1 = JOptionPane.showInputDialog("Registra el nombre y apellido de un familiar: ");
        String familiar2 = JOptionPane.showInputDialog("Registra el nombre y apellido de un familiar: ");
        String familiar3 = JOptionPane.showInputDialog("Registra el nombre y apellido de un familiar: ");

        String large = (familiar1.split(" ")[0].length() < familiar2.split(" ")[0].length()) ? familiar2 : familiar1;
        large = (familiar3.split(" ")[0].length() < large.split(" ")[0].length()) ? large: familiar3;

        System.out.println("El familiar con el nombre mas largo es " + large);
    }
}
