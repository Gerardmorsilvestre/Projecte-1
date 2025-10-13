package EstructuresIterativesBucles;
import java.util.Scanner;
public class Buclescomptats1 {
    public static void main(String[] args) {
        // demanar a l'usuari un nombre natural 1+ i en funcio del nombre a de mostrar tots el nombres que hi han entre mig, fent servir els 3 tipus de bucles
        Scanner lector = new Scanner(System.in);
        int Maxcount;

        System.out.println("Indica un nombre natural");
        Maxcount = lector.nextInt();

        System.out.println("Amb for!");
        for (int i = 1; i <= Maxcount; Maxcount--){
            System.out.println(i);
        }
        System.out.println();


        System.out.println("Amb while!");
        int cont = 1;
        while(cont >= Maxcount){
            Maxcount++;
            System.out.println(Maxcount);
             
        }
        System.out.println();


        System.out.println("Amb do while!");
        do {
            System.out.println(Maxcount);
            Maxcount--;
        } while (Maxcount != 1);
            System.out.println(Maxcount);
        
        lector.close();
    }
}
