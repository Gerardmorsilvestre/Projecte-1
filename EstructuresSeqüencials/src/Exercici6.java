
import java.util.Scanner;
public class Exercici6 {
    public static void main(String[] args) throws Exception {
        
        System.out.print("Digam la temperatura en graus Fahrenheit i te la dire en graus Celcius: ");
        Scanner fahrenheit = new Scanner (System.in);

        Double fahrenheitdemant = fahrenheit.nextDouble(); 
        Double celcius = (fahrenheitdemant - 32) * 5/9;

        System.out.format("La temperatura en graus Celcius és: %.2f\n", celcius);
        System.err.println("");
        fahrenheit.close();



    }
    
}
