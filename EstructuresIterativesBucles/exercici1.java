package EstructuresIterativesBucles;
import java.util.Scanner;

public class exercici1 {
    public static void main(String[] args) {
        
        System.out.println("Digues un numero i et diré els numeros naturals que hi han entre N i 1:");
        Scanner lector = new Scanner(System.in);
        int n1 = lector.nextInt();

        for (int i = 1; i <= n1; i+=1) {
            System.out.println(i);
        }
        lector.close();
    }
}