package Unidad1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ingrese un numero ");
        int numero = input.nextInt();

        if (numero >=1 && numero <=99) {
           
        if (numero < 10) {
         System.out.println("el numero es de un digito ");
            
        }
        else { 
            System.out.println(" el numero es de dos digitos ");
    
        
        }

            
        } else { System.out.println(" no cumple las condiciones ");

        }
        input.close();
    } 
}
