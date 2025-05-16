package Unidad2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        System.out.println("Introduce el nombre y la edad de los alumnos. Para terminar, escribe * como nombre.");

        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            nombres.add(nombre);
            edades.add(edad);
        }

        // Mostrar alumnos mayores de edad
        System.out.println("\nAlumnos mayores de edad:");
        boolean hayMayores = false;
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                hayMayores = true;
            }
        }
        if (!hayMayores) {
            System.out.println("No hay alumnos mayores de edad.");
        }

        // Encontrar la edad máxima
        int edadMaxima = -1;
        for (int edad : edades) {
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }

        // Mostrar alumnos con la edad máxima
        System.out.println("\nAlumnos con la mayor edad (" + edadMaxima + " años):");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == edadMaxima) {
                System.out.println(nombres.get(i));
            }
        }

        scanner.close();
    }
}

