import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el Primer Numero: ");
        int primerNumero = teclado.nextInt();

        int esPar = primerNumero % 2;

        if (esPar == 0) {
            System.out.println("El numero " + primerNumero + " es par.");
        } else {
            System.out.println("El numero " + primerNumero + " es impar.");
        }

        teclado.close();
    }
}