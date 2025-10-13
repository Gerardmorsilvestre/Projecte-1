package EstructuresIterativesBucles;

import java.util.Random;
import java.util.Scanner;
public class exercici13 {
    public static void main(String[] args) {
        
    Random rnd = new Random();
    int feedbackUsr;
    int randomInt;
    int origin = 1 , bound = 100;
    int cont = 0;
    Scanner as = new Scanner(System.in);
    

    do {
        randomInt = rnd.nextInt(origin, bound+1);

        System.out.println("Esculleixo " + randomInt);
        System.out.println("0: =  1: +  2: -");

        feedbackUsr = as.nextInt();

        cont++;
        if (feedbackUsr == 1){
            //actualizem l'origen
            origin = randomInt +1;
        } else if (feedbackUsr == 2){
            //actualitzem l'origen
            bound = randomInt -2;// es posa -2 sino no tindria sentit.
        }

        
    } while (feedbackUsr != 0);

    System.out.println(randomInt);
    System.out.println("Els numeros d'intents son: " + cont);
    as.close();
    
}
}