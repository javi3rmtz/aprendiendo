package Unidad2;

import java.util.Random;
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = random.nextInt(10) + 1;
        }

        System.out.println("Mostrando cada número, su cuadrado y su cubo:");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println("Número en la posición " + i + ": " + numero);
            System.out.println("   Cuadrado: " + cuadrado);
            System.out.println("   Cubo: " + cubo);
            System.out.println("------------------------------------------------");
        }
    }
}

