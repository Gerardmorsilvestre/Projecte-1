package EstructuresIterativesBucles;

import java.util.Scanner;

public class exercici6 {
    public static void main(String[] args) {
        
        System.out.println("Introduiré 100 numeros i aniras dient si es negatiu o no");
        Scanner as = new Scanner(System.in);
        int boundIntents = 100;
        int numtries = 0;
        int positiu = 0;
        int negatiu = 0;
        do {
            System.out.println("Introduiré 100 numeros i aniras dient si es negatiu o no");
            int num = as.nextInt();
            numtries++;
            if(num < 0) {
                System.out.println("numero negatiu");
                negatiu++;
            } else if (num > 0) {
                System.out.println("El numero es positiu");
                positiu++;
            } 
            
        } while (numtries < boundIntents);
        
        System.out.println("Ja has posat 100 numeros");
        System.out.println("Hi han " + positiu + " numeros positius");
        System.out.println("Hi han " + negatiu + " numeros negatius");
        as.close();
    }
}

