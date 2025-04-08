package Unidad1;
import java.util.Scanner;

public class Sentencia {

    public static void main(String[] args) {
        Scanner plus = new Scanner(System.in);
        System.out.println("ingrese el numero : ");
        int dia = plus.nextInt();
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    case 4:
        System.out.println("jueves");
        break;

    case 5: 
        System.out.println("viernes");
        break;        
    default:
        System.out.println("Día no válido");
        break;
}
plus.close();
    }
}
