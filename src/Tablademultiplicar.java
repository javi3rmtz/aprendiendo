import java.util.Scanner;

public class Tablademultiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ingrese un numero ");
        int numero = scanner.nextInt();

        for (int contador = 1; contador <= 10; contador++) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
        }
        
        scanner.close();


    }
}