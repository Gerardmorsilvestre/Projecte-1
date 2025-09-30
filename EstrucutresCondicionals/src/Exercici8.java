
import java.util.Scanner;
public class Exercici8 {
    public static void main(String[] args) throws Exception {
        // 9.	Programa que rep com a dades d'entrada una hora expressada en hores, minuts i segons i un temps expressat en segons 
        //i que ens calcula i escriu l'hora, minuts i segons que seran, transcorregut el temps especificat.
        int hores, minuts, segons, tempsSegons;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introdueix una hora (hores, minuts, segons):");
        hores = lector.nextInt();
        minuts = lector.nextInt();
        segons = lector.nextInt();
        System.out.println("Introdueix un temps desitjat en segons que es sumarà a les dades anteriors:");
        tempsSegons = lector.nextInt();
        // Afegim directament els segons
        segons = segons + tempsSegons;

        // Si els segons passen de 60, els convertim en minuts
        if (segons >= 60) {
            minuts = minuts + (segons / 60); // passem els segons sobrants a minuts
            segons = segons % 60;            // guardem els segons restants
        }

        // Si els minuts passen de 60, els convertim en hores
        if (minuts >= 60) {
            hores = hores + (minuts / 60);  // passem els minuts sobrants a hores
            minuts = minuts % 60;           // guardem els minuts restants
        }

        // Si les hores passen de 24, fem el mòdul per mantenir format de rellotge
        if (hores >= 24) {
            hores = hores % 24;
        }
        System.out.println("L'hora resultant és: " + hores + " hores, " + minuts + " minuts, " + segons + " segons.");
        

        
       
    lector.close();
    
}
}
