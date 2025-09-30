
import java.util.Scanner;
public class Exercici2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digam el costat del quadrat:");

        Scanner costat = new Scanner (System.in);
        Double costatquadrat = costat.nextDouble();
        Double area = costatquadrat * costatquadrat;

        System.out.format("L'area del quadrat de costat %.2f és %.2f\n", costatquadrat, area);
        costat.close();
}
}
