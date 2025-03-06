import java.util.Scanner;

public class Menuinteractivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("seleccione la opreacion que desea realizar ");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.division");
        System.out.println("4.multiplocacion");

        int opcion = scanner.nextInt();

        System.out.print("Ingrese el primer número: ");
        int Numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int Numero2 = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El Resultado es : " + (Numero1 + Numero2));
                break;
            case 2:
                System.out.println(" El Resultado es: " + (Numero1 - Numero2));
                break;
            case 3:
                System.out.println(" El Resultado es: " + (Numero1 * Numero2));
                break;
            case 4:
                if (Numero2 != 0) { // el numero 2 tiene que ser difrente de 0 (todo numero dividido por 0 no es definido)
                    System.out.println(" El Resultado es " + (Numero1 / Numero2));
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
                
        }
        scanner.close();
    }
}

  
    
