package Unidad1;
import java.util.Scanner;

public class Ejemplomatrizprom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; 
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; 
        }

        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio de los números es: " + promedio);
        
        scanner.close();
    }
}

