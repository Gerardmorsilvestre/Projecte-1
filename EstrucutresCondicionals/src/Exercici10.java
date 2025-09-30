import java.util.Scanner;
public class Exercici10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introdueix un preu inicial: ");
        System.out.println("Introdueix un preu final(et direm si et falta diners o t'en sobren): ");
        double preuInicial, preuFinal, diners;
        Scanner lector = new Scanner(System.in);
        preuInicial = lector.nextDouble();
        preuFinal = lector.nextDouble();
        if (preuInicial < preuFinal) {
            diners = preuFinal - preuInicial;
            System.out.println("Et falten " + diners + " euros");
        } else if (preuInicial > preuFinal) {
            diners = preuInicial - preuFinal;
            System.out.println("T'en sobren " + diners + " euros");
        } else {
            System.out.println("No et falten ni t'en sobren diners");
        }
        lector.close();
    }
}
