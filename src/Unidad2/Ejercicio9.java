package Unidad2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dias = 5;
        double[] tempMin = new double[dias];
        double[] tempMax = new double[dias];

        // Leer temperaturas mínimas y máximas
        for (int i = 0; i < dias; i++) {
            System.out.print("Temperatura mínima del día " + (i + 1) + ": ");
            tempMin[i] = Double.parseDouble(scanner.nextLine());

            System.out.print("Temperatura máxima del día " + (i + 1) + ": ");
            tempMax[i] = Double.parseDouble(scanner.nextLine());
        }

        // Mostrar temperatura media de cada día
        System.out.println("\nTemperatura media de cada día:");
        double[] tempMedia = new double[dias];
        for (int i = 0; i < dias; i++) {
            tempMedia[i] = (tempMin[i] + tempMax[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + tempMedia[i]);
        }

        // Encontrar la temperatura mínima absoluta entre las mínimas de todos los días
        double tempMinimaAbsoluta = tempMin[0];
        for (int i = 1; i < dias; i++) {
            if (tempMin[i] < tempMinimaAbsoluta) {
                tempMinimaAbsoluta = tempMin[i];
            }
        }

        // Mostrar los días con la temperatura mínima absoluta
        System.out.println("\nDías con la temperatura mínima (" + tempMinimaAbsoluta + "):");
        for (int i = 0; i < dias; i++) {
            if (tempMin[i] == tempMinimaAbsoluta) {
                System.out.println("Día " + (i + 1));
            }
        }

        // Leer una temperatura y mostrar los días cuya temperatura máxima coincide
        System.out.print("\nIntroduce una temperatura para buscar días con esa temperatura máxima: ");
        double tempBusqueda = Double.parseDouble(scanner.nextLine());

        boolean encontrado = false;
        System.out.println("Días con temperatura máxima igual a " + tempBusqueda + ":");
        for (int i = 0; i < dias; i++) {
            if (tempMax[i] == tempBusqueda) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay días con esa temperatura máxima.");
        }

        scanner.close();
    }
}
