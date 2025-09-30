
import java.util.Scanner;
public class Exercici3 {
    public static void main(String[] args) throws Exception {
        // 3.	Programa que llegeix un número i diu si és positiu, negatiu o zero. 
       int num1;
       System.out.println("Digam un un numero i et dire si es positiu, negatiu o zero");
       Scanner lector = new Scanner (System.in);
       num1 = lector.nextInt();

       if (num1 > 0) {
        System.out.println("El numero es positiu");
       } else if (num1 < 0) {
        System.out.println("El numero es negatiu");
       } else {
        System.out.println("El numero es zero");   
       }
    lector.close();
    }
    
}
