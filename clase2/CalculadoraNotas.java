import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la primera nota: ");
        double nota1 = teclado.nextDouble();
        if (nota1 < 0 || nota1 > 7) {
            System.out.println("Nota no válida");
            teclado.close();
            return;
        }

        System.out.print("Ingresa la segunda nota: ");
        double nota2 = teclado.nextDouble();
        if (nota2 < 0 || nota2 > 7) {
            System.out.println("Nota no válida");
            teclado.close();
            return;
        }

        System.out.print("Ingresa la tercera nota: ");
        double nota3 = teclado.nextDouble();
        if (nota3 < 0 || nota3 > 7) {
            System.out.println("Nota no válida");
            teclado.close();
            return;
        }

        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);

        switch ((int) promedio)        
        {
            case >= 4:
                System.out.println("Aprobado");
                break;
            case < 4:
                System.out.println("Reprobado");
                break;
        }  

        teclado.close();
    }
}