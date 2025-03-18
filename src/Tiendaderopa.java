public class Tiendaderopa {
    public static void main(String[] args) {
        // Definir constantes
        final double DESCUENTO_GENERAL = 0.15; 
        final double DESCUENTO_CAMISETA_EXTRA = 0.05;

        double precioCamiseta = 25;
        double precioPantalon = 30;

        double precioCamisetaDesc = precioCamiseta * (1 - DESCUENTO_GENERAL);
        double precioPantalonDesc = precioPantalon * (1 - DESCUENTO_GENERAL);

        double precioSegundaCamiseta = precioCamisetaDesc * (1 - DESCUENTO_CAMISETA_EXTRA);

        double precioTotal = precioCamisetaDesc + precioPantalonDesc + precioSegundaCamiseta;

        System.out.println("El precio total después de los descuentos es: $" + precioTotal);
    }
}