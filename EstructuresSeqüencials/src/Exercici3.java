
import java.util.Scanner;
public class Exercici3 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Digam dos numeros per sumar, restar, multiplicar i dividir:");
        // Scanner per a cada numero
        Scanner num1 = new Scanner (System.in);
        Scanner num2 = new Scanner (System.in);
        // Entrada
        Double numero1 = num1.nextDouble();
        Double numero2 = num2.nextDouble();
        // Operacions
        Double suma = numero1 + numero2;
        Double resta = numero1 - numero2;
        Double multiplicacio = numero1 * numero2;
        Double divisio = numero1 / numero2;
        // Resultats
        System.out.format("La suma de %.2f i %.2f és %.2f\n", numero1, numero2, suma);
        System.out.format("La resta de %.2f i %.2f és %.2f\n", numero1, numero2, resta);
        System.out.format("La multiplicació de %.2f i %.2f és %.2f\n", numero1, numero2, multiplicacio);
        System.out.format("La divisió de %.2f i %.2f és %.2f\n", numero1, numero2, divisio);
        num1.close();
        num2.close();
    }
}
