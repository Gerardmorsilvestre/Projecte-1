
import java.util.Scanner;
public class Exercici5 {
    public static void main(String[] args) throws Exception {
        // 5.	Programa que llegeix dos números i diu quin és el més gran o si són iguals.
        int num1 , num2;
        System.out.println("Digam dos numeros i et dire quin es mes gran o si son iguals");
        Scanner lector = new Scanner (System.in);
        num1 = lector.nextInt();   
        num2 = lector.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mes gran es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El numero mes gran es: " + num2);
        } else {
            System.out.println("Els dos numeros son iguals");
        }
    lector.close();
    }
    
}
