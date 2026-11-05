public class Desafio {
    public static void main(String[] args) {
        String nombre = "Paulo";
        String ciudad = "Santiago";
        String comidaFav = "Arroz";
        int edad = 43;
        int dias = edad * 365;
        int ahorro = 1000000;
        double valorDolar = 890.0;
        double ahorroEnDolar = ahorro/valorDolar;        
        int a = 5;
        int b = 8;
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("¡Hola, Mundo!");
        System.out.println("Me llamo "+nombre);
        System.out.println("Vivo en la ciudad de "+ ciudad);
        System.out.println("Mi comimda favorita es "+comidaFav);
        System.out.println("Mi edad es "+edad+" años");
        System.out.println("Mi edad en dias son "+dias+" dias");
        System.out.println("Mis ahorros ascienden a "+ahorro+" de pesos chilenos");
        System.out.printf("Mis ahorros en dólares ascienden a %.2f dólares%n", ahorroEnDolar);
        System.out.println("---DESAFIO---");
        System.out.println("valor posterior variable a: "+a);
        System.out.println("valor posterior variable b: "+b);
    }  
}
