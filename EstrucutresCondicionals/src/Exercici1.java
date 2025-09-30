
import java.util.Scanner;
public class Exercici1 {
    public static void main(String[] args) throws Exception {
        // 1.	Programa que llegeix dos números, calcula i mostra el valor de la suma, la resta, el producte i la divisió. (Tingues en compte la divisió per zero).
        int num1, num2;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introdueix dos números:");

        num1 = lector.nextInt();
        num2 = lector.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicació: " + (num1 * num2));
        // tenint en conter la divisió per zero
        if (num1 != 0 && num2 != 0) {
            System.out.println("Divisió: " + (num1 / num2));
        } else {
            System.out.println("No es pot dividir per zero.");
        }
    lector.close();
    }
}
