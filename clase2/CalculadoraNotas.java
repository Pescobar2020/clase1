import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la primera nota: ");
        double nota1 = teclado.nextDouble();
        if (nota1 < 1 || nota1 > 7) {
            System.out.println("Nota no válida");
            teclado.close();
            return;
        }

        System.out.print("Ingresa la segunda nota: ");
        double nota2 = teclado.nextDouble();
        if (nota2 < 1 || nota2 > 7) {
            System.out.println("Nota no válida");
            teclado.close();
            return;
        }

        System.out.print("Ingresa la tercera nota: ");
        double nota3 = teclado.nextDouble();
        if (nota3 < 1 || nota3 > 7) {
            System.out.println("Nota no válida");
            teclado.close();
            return;
        }

        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);

        if (promedio >= 4.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        teclado.close();
    }
}