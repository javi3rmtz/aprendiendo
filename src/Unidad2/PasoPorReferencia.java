package Unidad2;

// Clase Rectangulo con atributos ancho y alto
class Rectangulo {
    int ancho;
    int alto;

    // Constructor
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para mostrar los valores
    public void mostrarDimensiones() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
    }
}

public class PasoPorReferencia {
    
    // Método que modifica los atributos del objeto Rectangulo
    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 50;
        r.alto = 80;
        System.out.println("Dentro del método modificarRectangulo:");
        r.mostrarDimensiones();
    }

    public static void main(String[] args) {
        // Crear un objeto rectángulo
        Rectangulo miRectangulo = new Rectangulo(10, 20);

        System.out.println("Antes de modificar:");
        miRectangulo.mostrarDimensiones();

        // Modificar el objeto
        modificarRectangulo(miRectangulo);

        System.out.println("Después de modificar:");
        miRectangulo.mostrarDimensiones();
    }
}
