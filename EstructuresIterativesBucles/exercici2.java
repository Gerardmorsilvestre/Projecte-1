package EstructuresIterativesBucles;
import java.util.Scanner;

public class exercici2 {
    public static void main(String[] args) {
        System.out.println("Digues un numero i et diré els numeros parelles que hi han entre N i 1(utilitzan un comptador sumant de 2 en 2):");
        Scanner lector = new Scanner(System.in);
        int n1 = lector.nextInt();
        
        
        for (int i = 0; i <= n1; i+=2) {
            System.out.println(i);
        }
        lector.close();
        }
        }
        