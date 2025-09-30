import java.util.Scanner;
public class CondicionalSimple {
    public static void main(String[] args) throws Exception {
        int edat;
        boolean withAdult;
        Scanner lector = new Scanner(System.in);

        System.out.println("");
        System.out.print("Welcome to Razzmatazz. ");
        System.out.print("Please, enter your age: ");

        edat = lector.nextInt();
        if (edat >= 18) {
            System.out.println("You can enter. Enjoy!");
        } else {
            System.out.println("Are you with an adult? (true/false): ");

            withAdult = lector.nextBoolean();

            if (withAdult) {
                System.out.println("You can enter. Enjoy!, but you can't drink alcohol.");
            } else {
            System.out.println("You cannot enter. You are too young.");
        }

        lector.close();
        
    }

}
}
