package Unidad1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println(" ingrese la nota 1 : ");
       float nota1 = input.nextFloat();

       System.out.println(" ingrese la nota 2 : ");
       float nota2 = input.nextFloat();

       System.out.println(" ingrese la nota 3 : ");
       float nota3 = input.nextFloat();

       float promedio = ( nota1 + nota2 + nota3 ) /3;

       if (promedio >= 7) {
        System.out.println(" promocionado ");
        
       } else {
        System.out.println( " estudie que perdio mi padre ");
       }
       
       input.close();
    } 
}
