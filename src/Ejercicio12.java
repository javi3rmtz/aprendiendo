import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int n = input.nextInt();

        int contador100a300 = 0;
        int contadorMas300 = 0;
        int gastoTotal = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            int sueldo = input.nextInt();

            if (sueldo >= 100 && sueldo <= 300) {
                contador100a300++;
            } else if (sueldo > 300) {
                contadorMas300++;
            }

            gastoTotal += sueldo;
        }

        System.out.println("Empleados que cobran entre $100 y $300: " + contador100a300);
        System.out.println("Empleados que cobran más de $300: " + contadorMas300);
        System.out.println("Gasto total en sueldos: $" + gastoTotal);

        input.close();
    }
}

