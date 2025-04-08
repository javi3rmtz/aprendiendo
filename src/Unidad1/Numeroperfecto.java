package Unidad1;
import java.util.Scanner;

public class Numeroperfecto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ingrese un numero : ");
        int num = input.nextInt();
        boolean esPerfecto = false;

        if (num > 1) { 
            int sumDivisores = 1;
            
            for (int  i = 2 ; i <= Math.sqrt(num); i++ ) { 
                if (num % i == 0) { 
                 sumDivisores += i;
                 if (i != num/i ) { 
                    sumDivisores += num/i;
                
                }}
            }      
            System.out.println(" el numero " + num + " tiene " + sumDivisores + " divisores ");
            esPerfecto = (sumDivisores == num);
            System.out.println(" el numero es perfecto ? " + esPerfecto);
            
        }

     input.close();
    }
}