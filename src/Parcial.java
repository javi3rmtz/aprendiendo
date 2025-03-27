import java.util.Scanner;

public class Parcial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String mayorEdad = "", menorEdad = "";
        int edadMayor = 0, edadMenor = 0;
        double sumaEdades = 0;
        
        for (int i = 1; i <= 5; i++) {
        System.out.println("Ingrese el nombre y la edad del estudiante " + i + ":");
         String nombre = input.nextLine();
         int edad = input.nextInt();
         input.nextLine();  
        
         sumaEdades += edad;
        
         if (i == 1) { 
        edadMayor = edad;
        edadMenor = edad;
        mayorEdad = nombre;
        menorEdad = nombre;
        } else {
        if (edad > edadMayor) {
        edadMayor = edad;
        mayorEdad = nombre;
        }
        if (edad < edadMenor) {
        edadMenor = edad;
        menorEdad = nombre;
        } input.close();
}
}
        
    double promedio = sumaEdades / 5;
    System.out.println("Edad promedio de los estudiantes: " + promedio);
    System.out.println("El estudiante mayor es " + mayorEdad + " con " + edadMayor + " años.");   
    System.out.println("El estudiante menor es " + menorEdad + " con " + edadMenor + " años.");
    }
    

}
