import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ingrese un numero entero ");
        int entero = input.nextInt();

        if (entero > 0) {

            System.out.println(" el numero es positivo ");
            
        }
        else if (entero < 0) {
            System.out.println(" el numero es negativo ");
            
        } else { 
            System.out.println(" su numero es nulo ");


        }
        input.close();
    }
}