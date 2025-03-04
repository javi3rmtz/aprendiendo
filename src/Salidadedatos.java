
import java.util.Scanner;
public class Salidadedatos {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese su nombre");
    String nombre = scanner.nextLine();
    System.out.println("ingrese su edad");
    int edad = scanner.nextInt();
    System.out.println("ingrese su altura");
    float altura = scanner.nextFloat();

    System.out.println("hola ," + nombre + ", tienes , " + edad + " años y mides. : " + altura);

    scanner.close();
    }
}