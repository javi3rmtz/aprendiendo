package Unidad2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        int contador = 0;

        System.out.println("Introduce números enteros (negativo para terminar):");
        while (contador < vector.length) {
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            vector[contador] = num;
            contador++;
        }

        System.out.print("Números introducidos: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(vector[i] + " ");
        }

        scanner.close();
    } 
}
