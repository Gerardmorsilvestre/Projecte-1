import java.util.Scanner;
public class Exercici9 {
    public static void main( String [] args) throws Exception {
        //Salari net menusal d'un treballador en funcio de hores treballades i la taxa d'impostos segons l'anunciat
        Scanner lector = new Scanner(System.in); 
        int horesTreballades;
        double salaribrut;
        double salariT1;
        double salariT2;
        double impT1 = 0;
        double impT2 = 0;
        final double PREU_HORA = 15.0;
        final double I1 = 0.25;
        final double I2 = 0.45;
        final double TARIFA = 1.5;
        System.out.println("Introdueix les hores treballades:");
        horesTreballades = lector.nextInt();
        //Calcul del salari brut
        if (horesTreballades > 130){
            salaribrut = 130 * PREU_HORA;
            salaribrut += (horesTreballades - 130) *PREU_HORA*TARIFA; 
        } else {
            salaribrut = horesTreballades * PREU_HORA;
        }
        // Calcular impostos
        if (salaribrut > 500) {
            salariT1 = salaribrut - 500;
            if (salariT1 > 400) {
                impT1 = 400 * I1;
                salariT2 = salariT1 - 400;
                impT2 = salariT2 * I2;
            } else {
                impT1 = salariT1 * I1;
            }
        }
        double salariNet = salaribrut - (impT1 + impT2);
        System.out.println("Els impostos són: " + (impT1 + impT2) + "euros");
        System.out.println("El salari net mensual es: " + salariNet + " euros.");
        lector.close();
    }
}

