import java.util.Scanner;

public class MenuCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Menu Calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige una opcion: ");
        int opcion = teclado.nextInt();

        System.out.print("Ingresa el primer numero: ");
        double num1 = teclado.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double num2 = teclado.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division por cero");
                }
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        teclado.close();
    }
}