
import java.util.Scanner;

public class Exercicis1 {
    public static void main(String[] args) throws Exception {
       
        System.out.println("Digam el teu nom:");
    
        Scanner nom = new Scanner (System.in);
        String nomusuari = nom.nextLine();

        System.out.println("Bon Dia " + nomusuari);
        nom.close();
    }
}
