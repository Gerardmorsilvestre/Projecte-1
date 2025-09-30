
import java.util.Scanner;
public class Exercici4 {
    public static void main(String[] args) throws Exception {
        int num1 , num2;
        // 4.	Programa que llegeix dos números i els mostra en ordre ascendent.
        System.out.println("Digam dos numeros tels dire en ordre ascendent");
        Scanner lector = new Scanner (System.in);
        num1 = lector.nextInt();
        num2 = lector.nextInt();

        if (num1 < num2) {
            System.out.println("Els numeros en ordre ascendent son: " + num1 + " , " + num2);
        } else if (num2 < num1) {
            System.out.println("Els numeros en ordre ascendent son: " + num2 + " , " + num1);
        } else {
            System.out.println("Els dos numeros son iguals");
        }
    lector.close();
}
}