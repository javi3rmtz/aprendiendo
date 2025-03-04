
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese el numero ");
        int numero1 = scanner.nextInt();
        System.out.println(" ingrese el numero ");
        int numero2 = scanner.nextInt();
        System.out.println(" ingrese el numero ");
        int numero3 = scanner.nextInt();
        int suma = (numero1 + numero2 + numero3);
        float promedio = suma / 3; 

        System.out.println(" El promedio es : " + promedio);
     scanner.close();
    }
}
    

