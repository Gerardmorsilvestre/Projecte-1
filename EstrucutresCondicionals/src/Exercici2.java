
import java.util.Scanner;
public class Exercici2 {
    public static void main(String[] args) throws Exception {
        // 2.	Programa que llegeix dos números i diu quin és el més gran.
        int num1, num2;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introdueix dos números i et dire el més gran");
        num1 = lector.nextInt();
        num2 = lector.nextInt();

        if (num1 > num2) {
            System.out.println("El numero més gran és:" + num1);
        } else if (num2 > num1) {
            System.out.println("El numero més gran és:" + num2);
        } else {
            System.out.println("Els dos números són iguals.");
        }
    lector.close();
    }

    
}
