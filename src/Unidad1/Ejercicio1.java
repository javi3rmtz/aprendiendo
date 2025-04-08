package Unidad1;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("ingrese el numero 1");
            double numero1 = input.nextDouble();

            System.out.println("ingrese el numero 2");
            double numero2 = input.nextDouble();

            if (numero1 > numero2) {
                double resultadoSum = numero1 + numero2;
                double resresultadoRes = numero1 - numero2;

                System.out.println("la suma de los numeros es : " + resultadoSum + " y su resta es : " + resresultadoRes );

                
            } else  { 
                double resultadoProd = numero1 * numero2;
                double resultadoDiv = numero1 / numero2;
                System.out.println("el producto de los numeros es : " + resultadoProd + " y su division es : " + resultadoDiv );


        }
        input.close();
    }
}