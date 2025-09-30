
import java.util.Scanner;
public class Exercici12 {
public static void main(String[] args) throws Exception {
    double euros;
    System.out.println("Digam una quantitat d'EUROS, et donaré varies opcions, n'esculliràs una i et faré la conversió");
    Scanner lector = new Scanner(System.in);
    euros = lector.nextDouble();
    lector.nextLine();

    System.out.println("Digam a que ho vols pasar: 'libras' o 'dolars'?");
    String tipus = lector.nextLine();

    switch (tipus) {
        case "libras":
            double libras = euros / 1.15;
            System.out.format("Tindries un total de " + libras + " libras.");
            break;
        case "dolars":
            double dolars = euros * 1.17;
            System.out.format("Tindras un total de " + dolars + " dolars.");
            break;
        default:
            System.out.println("No es pot fer la conversió");
            break;
    }
    lector.close();
}              
}
