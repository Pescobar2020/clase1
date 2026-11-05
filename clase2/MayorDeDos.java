import java.util.Scanner;

public class MayorDeDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("Ambos numeros son iguales.");
        }

        teclado.close();
    }
}