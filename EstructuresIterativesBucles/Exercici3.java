package EstructuresIterativesBucles;

import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        
        System.out.println("Digues un numero i et diré els numeros parelles que hi han entre N i 1(utilitzant un comptador sumant d'1 en 1):");
        Scanner lector = new Scanner(System.in);
        int n1 = lector.nextInt();
        
        
        for (int i = 0; i <= n1; i+=2) {
            System.out.println(i);
        }
        lector.close();
}
}