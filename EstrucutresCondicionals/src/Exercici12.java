import java.util.Scanner;
public class Exercici12 {
    public static void main(String[] args) throws Exception{
        
        System.out.println("Digam una quantitat d'EUROS, et donaré varies opcions, n'esculliràs una i et faré la conversió");
        Scanner lector = new Scanner(System.in);
        double libras, dollars;
        System.out.println("Digam a que ho vols pasar a libras o a dollars?");
        libras = lector.nextDouble();
        dollars = lector.nextDouble();
        
    }
}
