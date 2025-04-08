package Unidad1;
public class Contadorpar {

    public static void main(String[] args) {
                int contadorPares = 0;
        
                for (int numero = 1; numero <= 100; numero++) {
                    if (numero % 2 == 0) {
                       contadorPares++;
                    }
                }
        
                // Imprimimos el resultado
                System.out.println("Hay " + contadorPares + " números pares entre 1 y 100.");
            }
        }
        
