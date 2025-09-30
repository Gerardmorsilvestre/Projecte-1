import java.util.Scanner;
public class Exercici11 {
    public static void main(String[] args) {
    System.out.println("Diga'm de quin color es el semàfor (vermell, groc o verd): ");
    Scanner lector = new Scanner(System.in);
    String color = lector.nextLine();
    //switch (color) {
        //case value:
            
       //     break;
    
      //  default:
          //  break;
    //}
    
    if (color.equals("vermell")) {
        System.out.println("Esperar");
    } else if (color.equals("groc")) {
        System.out.println("Córrer");
    } else if (color.equals("verd")) {
        System.out.println("Passar");
    } else {
        System.out.println("Color no vàlid");
    }
    lector.close();
}   
}