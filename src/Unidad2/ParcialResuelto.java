package Unidad2;

import java.util.Random;

public class ParcialResuelto{

    public static void main(String[] args) {
        int[][] laberinto = generarMatriz();
        mostrarMatriz(laberinto);

        System.out.println(" Cantidad de números pares mayores a 4: " + contarParesMayoresA4(laberinto));
        System.out.println(" Promedio de números impares: " + promedioImpares(laberinto));
        System.out.println(" Suma de cada fila:");
        sumarFilas(laberinto);

        int[] posicionMax = encontrarMayor(laberinto);
        System.out.println(" El número más alto está en la posición: [" + posicionMax[0] + "][" + posicionMax[1] + "]");
    }

    public static int[][] generarMatriz() {
        int[][] matriz = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int contarParesMayoresA4(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 == 0 && valor > 4) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static double promedioImpares(int[][] matriz) {
        int suma = 0, cantidad = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 != 0) {
                    suma += valor;
                    cantidad++;
                }
            }
        }
        return cantidad > 0 ? (double) suma / cantidad : 0;
    }

    public static void sumarFilas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int valor : matriz[i]) {
                sumaFila += valor;
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }
    }

    public static int[] encontrarMayor(int[][] matriz) {
        int maxValor = matriz[0][0];
        int[] posicion = {0, 0};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxValor) {
                    maxValor = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
}
