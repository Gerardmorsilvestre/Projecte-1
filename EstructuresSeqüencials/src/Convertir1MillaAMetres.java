
import java.util.Scanner;

public class Convertir1MillaAMetres {
    public static void main(String[] args) throws Exception{
        // 1 milla = 1609 metres
        // Definim el factor de conversió.
        final int MILLES_A_METRES = 1609;
        // Printem el missatge per demanar a l'usuari que introdueixi el nombre de milles.

        System.out.println("Introdueix el nombre de milles que vols convertir a metres:");
        // Creem un objecte de la classe Scanner per llegir dades des del teclat.
        Scanner lector = new Scanner (System.in);
        // Scanner es una classe que ens permet llegir dades des del teclat.
        // (System.in) es el canal d'entrada estandard, que normalment es el teclat.
        int millesusuari = lector.nextInt();
        // nextInt() es un metode de la classe Scanner que llegeix un enter des del teclat i es guarda en el int millesusuari.
        int metres = millesusuari * MILLES_A_METRES;
        System.out.println(millesusuari + " milles son "+ metres + " metres.");
        lector.close();
        
    }

}