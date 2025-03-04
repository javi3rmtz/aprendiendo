import java.util.Scanner;

public class Mayordetres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero " );
        int Numero1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero " );
        int Numero2 = scanner.nextInt();
        System.out.println("ingrese el segundo numero " );
        int Numero3 = scanner.nextInt();
    
        if (Numero1 >  Numero2 && Numero1 > Numero3) {
            System.out.println("El mayor es: " + Numero1);
        } else if (Numero2 > Numero1 && Numero2 > Numero3) {
            System.out.println("El mayor es: " + Numero2);
        } else {
            System.out.println("El mayor es: " + Numero3);

    
scanner.close();
}
} }