package Unidad2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = 5;
        int columnas = 5;
        int[][] matriz = new int[filas][columnas];

        // Cargar la matriz con valores enteros
        System.out.println("Introduce los valores para la matriz 5x5:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        // Sumar y mostrar la suma de cada fila
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        // Sumar y mostrar la suma de cada columna
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }

        scanner.close();
        
    }
}

