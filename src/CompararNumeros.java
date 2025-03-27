import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        int mayor = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        input.close();
    }
}
