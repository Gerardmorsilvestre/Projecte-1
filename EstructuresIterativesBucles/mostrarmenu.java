package EstructuresIterativesBucles;
import java.util.Scanner;
public class mostrarmenu {
    public static void main(String[] args) throws Exception {
    
    System.out.println("Mostrar menu:");
    Scanner lector = new Scanner(System.in);
    int opció;

    do {
        // mostrar menu
        System.out.println("1- Seguir");
        System.out.println("0- Sortir");
        System.out.println("2- Acció alternativa");
        opció = lector.nextInt();

    }while (opció != 0);
    System.out.println("Menu tancat");

    lector.close();
}
}