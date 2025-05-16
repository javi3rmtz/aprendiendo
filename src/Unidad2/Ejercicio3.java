package Unidad2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;
        double mayor = 0;
        double menor = 10;

        System.out.print("Ingrese las 5 notas del alumno (entre 0 y 10): ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
            suma += notas[i];
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        System.out.print("Notas ingresadas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.print("\nNota media: " + (suma / notas.length));
        System.out.print("\nNota más alta: " + mayor);
        System.out.print("\nNota más baja: " + menor);
        
        scanner.close();
    } 
}

