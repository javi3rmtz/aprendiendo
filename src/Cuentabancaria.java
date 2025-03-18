public class Cuentabancaria {
    public static void main(String[] args) throws Exception {
        // dinero en la cuenta 
        int dinero = 1000;
        //total de retiro al mes 
        int retiro = 200 * 4;
        int resta = dinero - retiro;
       

        System.out.println("el dinero que sobro en su cuenta es de :" + resta );
}
}