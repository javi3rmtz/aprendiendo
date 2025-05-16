package Unidad2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int partidos = 15;

        String[][] equipos = new String[partidos][2];
        int[][] resultados = new int[partidos][2];

        // Leer nombres de equipos para cada partido
        for (int i = 0; i < partidos; i++) {
            System.out.println("Partido " + (i + 1) + ":");
            System.out.print("  Nombre del equipo local: ");
            equipos[i][0] = sc.nextLine();

            System.out.print("  Nombre del equipo visitante: ");
            equipos[i][1] = sc.nextLine();
        }

        // Leer resultados de goles por partido
        for (int i = 0; i < partidos; i++) {
            System.out.println("Resultados del partido " + (i + 1) + ":");
            System.out.print("  Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = sc.nextInt();

            System.out.print("  Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = sc.nextInt();
            sc.nextLine(); // limpiar buffer
        }

        // Mostrar resumen
        System.out.println("\nResumen de la quiniela:");
        for (int i = 0; i < partidos; i++) {
            System.out.println("Partido " + (i + 1) + ": " + equipos[i][0] + " " + resultados[i][0] +
                               " - " + resultados[i][1] + " " + equipos[i][1]);
        }

        sc.close();
    }
}
