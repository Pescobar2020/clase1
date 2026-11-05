public class Main {
    public static void main(String[] args) {
        String nombre = "Paulo";
        int edad = 30;
        double estatura = 1.75;
        boolean estudiaJava = true;

        System.out.println("¡Hola, Mundo!");
        System.out.println("Me llamo "+nombre);
        System.out.println("Tengo "+ edad+" años");
        System.out.println("Mido "+estatura+" Metros");
        System.out.println("¿Estudio Java? "+estudiaJava);

        edad = edad + 1;

        System.out.println("El proximo año tendre "+ edad+" años");    
    }
}