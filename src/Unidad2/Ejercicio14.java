package Unidad2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int articulos = 5;
        int sucursales = 4;

        double[] precios = new double[articulos];
        int[][] cantidades = new int[articulos][sucursales];

        // Leer precios de los artículos
        for (int i = 0; i < articulos; i++) {
            System.out.print("Ingrese el precio del artículo " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }

        // Leer cantidades vendidas por cada sucursal y artículo
        for (int i = 0; i < articulos; i++) {
            for (int j = 0; j < sucursales; j++) {
                System.out.print("Cantidad vendida del artículo " + (i + 1) + " en sucursal " + (j + 1) + ": ");
                cantidades[i][j] = sc.nextInt();
            }
        }

        // Cantidades totales de cada artículo
        System.out.println("\nCantidades totales vendidas por artículo:");
        int[] totalPorArticulo = new int[articulos];
        for (int i = 0; i < articulos; i++) {
            int suma = 0;
            for (int j = 0; j < sucursales; j++) {
                suma += cantidades[i][j];
            }
            totalPorArticulo[i] = suma;
            System.out.println("Artículo " + (i + 1) + ": " + suma);
        }

        // Cantidad total en sucursal 2
        int totalSucursal2 = 0;
        for (int i = 0; i < articulos; i++) {
            totalSucursal2 += cantidades[i][1]; // índice 1 es sucursal 2
        }
        System.out.println("\nCantidad total de artículos en la sucursal 2: " + totalSucursal2);

        // Cantidad del artículo 3 en sucursal 1
        int cantArt3Suc1 = cantidades[2][0]; // índice 2 es artículo 3, índice 0 sucursal 1
        System.out.println("Cantidad del artículo 3 en la sucursal 1: " + cantArt3Suc1);

        // Recaudación total por sucursal
        double[] recaudacionSucursal = new double[sucursales];
        for (int j = 0; j < sucursales; j++) {
            double total = 0;
            for (int i = 0; i < articulos; i++) {
                total += precios[i] * cantidades[i][j];
            }
            recaudacionSucursal[j] = total;
        }

        System.out.println("\nRecaudación total por sucursal:");
        for (int j = 0; j < sucursales; j++) {
            System.out.println("Sucursal " + (j + 1) + ": $" + recaudacionSucursal[j]);
        }

        // Recaudación total empresa
        double totalEmpresa = 0;
        for (double monto : recaudacionSucursal) {
            totalEmpresa += monto;
        }
        System.out.println("Recaudación total de la empresa: $" + totalEmpresa);

        // Sucursal con mayor recaudación
        int sucursalMayor = 0;
        double mayorMonto = recaudacionSucursal[0];
        for (int j = 1; j < sucursales; j++) {
            if (recaudacionSucursal[j] > mayorMonto) {
                mayorMonto = recaudacionSucursal[j];
                sucursalMayor = j;
            }
        }
        System.out.println("Sucursal con mayor recaudación: Sucursal " + (sucursalMayor + 1));

        sc.close();
    }
}

