import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contadormayorigual7 = 0;
        int contadormenor7 = 0;

        for (int i = 1; i <=10; i++) { 
            System.out.println(" ingrese la nota del alumno  " + i + " : ");
            double nota = input.nextDouble();

            if (nota >=7) {
                contadormayorigual7++;
                
            } else { 
                contadormenor7++;
            }

        }
        System.out.println("Cantidad de alumnos con nota mayor o igual a 7: " + contadormayorigual7);
        System.out.println("Cantidad de alumnos con nota menor a 7: " + contadormenor7);

        input.close();
    } 

}