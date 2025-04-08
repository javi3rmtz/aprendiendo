package Unidad1;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el sueldo: ");
        int sueldo = input.nextInt();

        System.out.println("Ingrese los años de antigüedad: ");
        int antiguedad = input.nextInt();

        if (sueldo < 500 && antiguedad >= 10) {
            sueldo += sueldo * 0.20; 
        } else if (sueldo < 500 && antiguedad < 10) {
            sueldo += sueldo * 0.05;
        }
        
        System.out.println("El sueldo a pagar es: " + sueldo);
        
        input.close();
    }
}
