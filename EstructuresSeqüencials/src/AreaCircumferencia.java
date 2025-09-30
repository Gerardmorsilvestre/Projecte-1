
import java.util.Scanner;

public class AreaCircumferencia {
    public static void main(String[] args) throws Exception {
        // Printem el missatge per demanar a l'usuari que introdueixi el radi de la circumferencia.
        System.out.println(" Introdueix el radi de la circumferencia:");
        // Creem un objecte de la classe Scanner per llegir dades des del teclat.
        Scanner circumferencia = new Scanner (System.in);
        // Scanner es una classe que ens permet llegir dades des del teclat.
        Double radi = circumferencia.nextDouble();
        // nextDouble() es un metode de la classe Scanner que llegeix un double des del teclat i es guarda en el double radi.
        Double AreaCircumferencia = Math.PI*radi*radi;
        // Calculem l'area de la circumferencia.
        
        System.out.format("L'area de la circumferencia %.2f és %.2f\n", radi, AreaCircumferencia);
        circumferencia.close();
    }

}
