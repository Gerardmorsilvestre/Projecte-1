import java.util.Scanner;
public class CondicionalMúltiple {
    public static void main(String[] args) throws Exception {
        // Llegeix el número de dia de la setmana i mostra el dia de la setmana.
    System.out.println("Introdueix un número de dia de la setmana (1-7): ");
    Scanner lector = new Scanner(System.in);
// Declarem la variable dia per emmagatzemar el número introduït per l'usuari.
    // Llegim el número de dia.
    int diaSetmanaNum = lector.nextInt();
    // es poy substituir "dia" per "diaSetmanaNum", si estem utilitzant switch o if-else.
    // Utilitzem una estructura switch per determinar el dia de la setmana.
    //Switch case es una estructura de control que permite seleccionar una entre varias opciones basándose en el valor de una expresión.
    if(diaSetmanaNum ==1){
        System.out.println("Dilluns");
    } else if (diaSetmanaNum ==2) {
        System.out.println("Dimarts");
    } else if (diaSetmanaNum ==3) {
        System.out.println("Dimecres");
    } else if (diaSetmanaNum ==4) {
        System.out.println("Dijous");
    } else if (diaSetmanaNum ==5) {
        System.out.println("Divendres");
    } else if (diaSetmanaNum ==6) {
        System.out.println("Dissabte");
    } else if (diaSetmanaNum ==7) {
        System.out.println("Diumenge");
    } else {
        System.out.println("Número de dia no vàlid.");
    }
   
   
   
   
    /* 
    switch (dia) {
        case 1:
            System.out.println("Dilluns");
            break;
        case 2:
            System.out.println("Dimarts");
            break;
        case 3:
            System.out.println("Dimecres");
            break;
        case 4:
            System.out.println("Dijous");
            break;
        case 5:
            System.out.println("Divendres");
            break;
        case 6:
            System.out.println("Dissabte");
            break;
        case 7:
            System.out.println("Diumenge");
            break;
        // El cas por defecto se ejecuta si ninguna de las opciones anteriores coincide con el valor de la expresión.
        default:
            System.out.println("Número de dia no vàlid.");
            break;
    
    }
            */


    lector.close();
}
}
