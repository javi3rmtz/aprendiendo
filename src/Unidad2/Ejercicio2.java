package Unidad2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] original = new String[5];
        String[] inverso = new String[5];

        System.out.println("Ingrese 5 palabras para llenar el vector:");
        for (int i = 0; i < original.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            original[i] = scanner.nextLine();
        }

        // Copiar al vector inverso
        for (int i = 0; i < original.length; i++) {
            inverso[i] = original[original.length - 1 - i];
        }

        // Mostrar los dos vectores
        System.out.println("Vector original:");
        for (int i = 0; i < original.length; i++) {
            System.out.println("Posición " + i + ": " + original[i]);
        }

        System.out.println("Vector en orden inverso:");
        for (int i = 0; i < inverso.length; i++) {
            System.out.println("Posición " + i + ": " + inverso[i]);
        }
        scanner.close();
    }
}

