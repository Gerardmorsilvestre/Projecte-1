
import java.util.Scanner;
public class Exercici7 {
    public static void main(String[] args) throws Exception {
        //8.	Programa que llegeix una qualificació numèrica decimal x entre 0 i 10 
        //i la transforma en qualificació alfabètica, escrivint-ne el resultat.
    //float nota es un numero decimal
    float nota;
    Scanner lector = new Scanner (System.in);
    System.out.println("Introdueix una nota entre 0 i 10 i et dire la qualificació alfabètica");
    nota = lector.nextFloat();
    
    if (nota >= 0 && nota <= 3) {
        System.out.println("La qualificació alfabètica és: Molt deficient");
    } else if (nota >= 3.1 && nota <= 5) {
        System.out.println("La qualificació alfabètica és: Insuficient");
    } else if (nota >= 5.1 && nota <= 6) {
        System.out.println("La qualificació alfabètica és: Suficient");
    } else if (nota >= 6.1 && nota <= 7) {
        System.out.println("La qualificació alfabètica és: bé");
    } else if (nota >= 7.1 && nota <= 9) {
        System.out.println("La qualificació alfabètica és: Notable");
    } else if (nota >= 9.1 && nota <= 10) {
        System.out.println("La qualificació alfabètica és: Excel·lent");
    } else {
        System.out.println("La nota introduïda no és vàlida. Ha de ser entre 0 i 10.");
    }

    lector.close(); 
}
}
