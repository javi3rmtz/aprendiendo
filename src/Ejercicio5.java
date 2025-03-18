import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ingrese el numero 1 : ");
        int numero1 = input.nextInt();

        System.out.println(" ingrese el numero 2 : ");
        int numero2 = input.nextInt();

        if (numero1 > numero2) { 
            System.out.println(" el numero mayor es : " + numero1 );
            
        } else { 
            System.out.println(" el numero mayor es : " + numero2);

        }
        input.close();
    }
}