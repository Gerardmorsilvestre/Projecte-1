package EstructuresIterativesBucles;
import java.util.Random;
import java.util.Scanner;
public class exercici12 {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int numUsr;
        int randomInt;
        int cont = 0;
        final int BOUND = 100;
        
        randomInt = rnd.nextInt(1, BOUND+1);
        Scanner as = new Scanner(System.in);
        do {
            System.out.println("Introdueix un numero del 1 al 100 i jugaras amb la màquina fins que l'edivinis");
            numUsr = as.nextInt();
            cont++;

            if ( numUsr < randomInt) {
                System.out.println("El teu numero es menor que el de la màquina");

            } else if ( numUsr > randomInt) {
                System.out.println("El teu numero es major que el de la màquina");
            } 

        } while (numUsr != randomInt);

        System.out.println("El teu numero es igual al de la màquina");
        System.out.println("El numero de intents son: " +cont);
        
        as.close();
        
    }
        

    }

