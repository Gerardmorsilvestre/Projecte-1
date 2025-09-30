
import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) throws Exception {
        // Programa que pren com a dada d'entrada un número que correspon a la longitud d'un radi i ens escriu la longitud de la circumferència, 
        // l'àrea del cercle i el volum de l'esfera que es corresponen amb aquest radi.
        System.out.println( "Digam el radi de la cicumferència.");
    
        Scanner radi = new Scanner (System.in);
        Double radicercle = radi.nextDouble();
        // Formula per saber la longitud de la circumferència
        Double longitud = 2 * Math.PI * radicercle;
        // Formula per saber l'àrea del cercle
        Double area = Math.PI * Math.pow(radicercle*radicercle, 1);
        // Formula per saber el volum de l'esfera
        Double volum = ( 4/3) * Math.PI * radicercle*radicercle*radicercle;

        System.out.println( "La longitud de la circumferència és: " + longitud);
        System.out.println( "L'àrea del cercle és: " + area);
        System.out.println( "El volum de l'esfera és: " + volum);
        radi.close();

    }
}
