
import java.util.Scanner;

public class Exercici5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digam el preu nominal (descompte) i el preu de venta de producte:");

        Scanner preunominal = new Scanner (System.in);
        Scanner preuventa = new Scanner (System.in);

        Double preunominalusuari = preunominal.nextDouble();
        Double preuventausuari = preuventa.nextDouble();

        Double descompte = ((preunominalusuari - preuventausuari) / preunominalusuari) * 100;

        System.out.println("El descompte és de: " + descompte + "%");
        preunominal.close();
        preuventa.close();

}
}
