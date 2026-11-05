public class ConversorMoneda {
    public static void main(String[] args) {
        String nombre = "Paulo";
        String ciudad = "Santiago";
        String comidaFav = "Arroz";
        int edad = 43;
        int dias = edad * 365;
        int ahorro = 1000000;
        double valorDolar = 890.0;
        double ahorroEnDolar = ahorro/valorDolar;


        System.out.println("¡Hola, Mundo!");
        System.out.println("Me llamo "+nombre);
        System.out.println("Vivo en la ciudad de "+ ciudad);
        System.out.println("Mi comimda favorita es "+comidaFav);
        System.out.println("Mi edad es "+edad+" años");
        System.out.println("Mi edad en dias son "+dias+" dias");
        System.out.println("Mis ahorros ascienden a "+ahorro+" de pesos chilenos");
        System.out.printf("Mis ahorros en dólares ascienden a %.2f dólares%n", ahorroEnDolar);

    }  
}
