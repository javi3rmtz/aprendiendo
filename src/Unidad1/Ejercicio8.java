package Unidad1;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = input.nextInt();

        System.out.print("Ingrese la cantidad de respuestas correctas: ");
        int respuestasCorrectas = input.nextInt();

        double porcentaje = (respuestasCorrectas * 100) / totalPreguntas;

        if (porcentaje >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentaje >= 75) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }

        input.close();
    }
}
