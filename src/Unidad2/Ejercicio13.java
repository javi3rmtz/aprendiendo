package Unidad2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numConductores = 3; // Puedes cambiar el número de conductores
        int diasSemana = 7;

        String[] nombres = new String[numConductores];
        int[][] kms = new int[numConductores][diasSemana];
        int[] total_kms = new int[numConductores];

        // Leer nombres y kilómetros diarios
        for (int i = 0; i < numConductores; i++) {
            System.out.print("Ingrese el nombre del conductor " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.println("Ingrese los kilómetros conducidos cada día de la semana:");
            for (int j = 0; j < diasSemana; j++) {
                System.out.print("  Día " + (j + 1) + ": ");
                kms[i][j] = sc.nextInt();
            }
            sc.nextLine(); // Limpiar buffer
        }

        // Calcular total de kilómetros por conductor
        for (int i = 0; i < numConductores; i++) {
            int suma = 0;
            for (int j = 0; j < diasSemana; j++) {
                suma += kms[i][j];
            }
            total_kms[i] = suma;
        }

        // Mostrar resultados
        System.out.println("\nKilómetros totales por conductor:");
        for (int i = 0; i < numConductores; i++) {
            System.out.println(nombres[i] + ": " + total_kms[i] + " km");
        }

        sc.close();
    }
}
