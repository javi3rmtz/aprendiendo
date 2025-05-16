package Unidad2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        // Pedir valores para vector1
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Introduce el valor " + (i + 1) + " para vector1: ");
            vector1[i] = scanner.nextInt();
        }

        // Pedir valores para vector2
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Introduce el valor " + (i + 1) + " para vector2: ");
            vector2[i] = scanner.nextInt();
        }

        // Calcular vector3 = vector1 + vector2
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        // Mostrar vector3
        System.out.println("vector3 = vector1 + vector2:");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector3[i]);
        }

        scanner.close();
    }

}
