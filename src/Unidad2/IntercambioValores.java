package Unidad2;

public class IntercambioValores {

    // Método que intenta intercambiar los valores de dos variables
    public static void intercambiar(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Dentro del método intercambiar:");
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Antes de llamar a intercambiar:");
        System.out.println("a = " + a + ", b = " + b);

        // Intentamos intercambiar
        intercambiar(a, b);

        System.out.println("Después de llamar a intercambiar:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
