package Unidad2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Random random = new Random();

        // Inicializar con valores aleatorios del 1 al 100
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100) + 1;
        }

        // Mostrar vector original
        System.out.print("Vector original: ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ordenar el vector
        Arrays.sort(vector);

        // Mostrar vector ordenado
        System.out.print("Vector ordenado: ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}
