package Unidad1;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;
        System.out.println(" ingrese el numero al cual desea buscar el factorial ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            factorial = factorial * numero;
            numero = numero - 1;   
        }
        System.out.println(" El factorial del numero leido es: " + factorial );
        scanner.close();
    }
}