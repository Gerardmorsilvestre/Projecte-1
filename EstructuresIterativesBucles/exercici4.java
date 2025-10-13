package EstructuresIterativesBucles;

import java.util.Scanner;

public class exercici4 {
    public static void main(String[] args) {
       System.out.println("Digues un numero i et diré el seu factorial:");
        Scanner lector = new Scanner(System.in);
        int n1 = lector.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n1; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n1 + " és " + factorial);
    lector.close();
    }
}
