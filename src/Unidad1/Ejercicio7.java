package Unidad1;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo de hasta tres cifras:");
        int numero = input.nextInt();

        if (numero >= 1 && numero <= 999) {
            if (numero < 10) {
                System.out.println("El número tiene una cifra.");
            } else if (numero < 100) {
                System.out.println("El número tiene dos cifras.");
            } else {
                System.out.println("El número tiene tres cifras.");
            }
        } else {
            System.out.println("Error: El número ingresado tiene más de tres cifras.");
        }

        input.close();
    }
}
