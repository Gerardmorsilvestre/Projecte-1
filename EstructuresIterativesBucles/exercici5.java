package EstructuresIterativesBucles;
import java.util.Scanner;

public class exercici5 {
    public static void main(String[] args) {
        
        System.out.println("Introduiré 100 numeros i aniras dient si es negatiu o no");
        Scanner as = new Scanner(System.in);
        int boundIntents = 100;
        int numtries = 0;
        do {
            System.out.println("Introduiré 100 numeros i aniras dient si es negatiu o no");
            int num = as.nextInt();
            numtries++;
            if(num < 0) {
                System.out.println("numero negatiu");
                
            } else if (num > 0) {
                System.out.println("El numero es positiu");
                
            } 
            
        } while (numtries < boundIntents);
        
        System.out.println("Ja has posat 100 numeros");
        as.close();
    }
}
