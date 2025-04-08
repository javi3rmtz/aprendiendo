package Unidad1;
import java.util.Scanner;

public class operadores {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(" ingrese el primer numero ");
    int numero1 = scanner.nextInt();
    System.out.println(" ingrese el segundo numero ");
    int numero2 = scanner.nextInt();
    System.out.println(" ingrese el tercer numero ");
    int numero3 = scanner.nextInt();

    boolean condicion1  = (numero1 > numero2) && (numero1 < numero3);
    System.out.println(" ¿ es el primer numero mayor que es segundo y menor que el tercero ?. " + condicion1);
    boolean condicion2 = (numero1 == numero2) || (numero1 == numero3);
    System.out.println("¿El primer número es igual al segundo o al tercero? " + condicion2);

    boolean condicion3 = (numero1 != numero2) && (numero1 != numero3) && (numero2 != numero3);
    System.out.println("¿Los tres números son diferentes entre sí? " + condicion3);

    boolean condicion4 = !(numero1 > numero2 && numero1 > numero3);
    System.out.println("¿El primer número NO es el mayor? " + condicion4);

    boolean condicion5 = (numero2 > numero1 && numero2 < numero3) || (numero2 < numero1 && numero2 > numero3);
    System.out.println("¿El segundo número está entre el primero y el tercero? " + condicion5);

    
    scanner.close();

    }
}