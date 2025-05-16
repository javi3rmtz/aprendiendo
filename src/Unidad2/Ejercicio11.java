package Unidad2;

public class Ejercicio11 {
    public static void main(String[] args) {
        int tamaño = 5;
        int[][] diagonal = new int[tamaño][tamaño];

        // Llenar la matriz: 1 en diagonal principal, 0 en el resto
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Contenido de la matriz diagonal:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
