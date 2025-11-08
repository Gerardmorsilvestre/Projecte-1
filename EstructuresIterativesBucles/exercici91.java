package EstructuresIterativesBucles;
import java.util.Scanner;
public class exercici91 {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce notas (0-10). Acaba con -1.");

    boolean Deu = false; //Si alguna nota es 10
    int cont5 = 0; //Contador de notes >= 5

    int nota = sc.nextInt();   //Llegim la primera nota (pot ser -1 inmediatament)
    //Bucle while: Es repetix mentres no es posi -1
    while (nota != -1) {
      //Fem una funcio que si l'usuari no posa una nota entre els valors desitjat que la torni a introduir
      if (nota < 0 || nota > 10) {
        System.out.println("Nota inválida. Introdueix un valor entre 0 i 10, o -1 per acabar:");
        nota = sc.nextInt(); // Leemos de nuevo y volvemos al inicio del bucle
        continue;
      }
      // Si la nota es 10, activem el boolea
      if (nota == 10) {
        Deu = true;
      }
      // Si la nota es mayor o igual a 5, la contem
      if (nota >= 5) {
        cont5++;
      }
      // Llegim la seguent nota (pot ser -1 para acabar)
      nota = sc.nextInt();
    }
    // Resultat final mostrem quantitat de 10 i quantitat de notes >= 5, hi han agut
    if (Deu) System.out.println("Hi va haver almenys una nota 10.");
    else System.out.println("No hi va haver cap nota 10.");
    System.out.println("Nombre de notes >= 5: " + cont5);
    sc.close();
  }
}

}

