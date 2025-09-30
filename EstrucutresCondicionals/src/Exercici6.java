
import java.util.Scanner;
public class Exercici6 {
    public static void main(String[] args) throws Exception {
        // 6.	Programa que llegeix tres números i diu quin és el més gran.
        int num1, num2, num3;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introdueix tres números i et dire el més gran");
        num1 = lector.nextInt();
        num2 = lector.nextInt();
        num3 = lector.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero més gran és:" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero més gran és:" + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero més gran és:" + num3);
        } else {
            System.out.println("Hi ha dos o més números iguals i són els més grans.");
        }
    lector.close();
    }

    
}
