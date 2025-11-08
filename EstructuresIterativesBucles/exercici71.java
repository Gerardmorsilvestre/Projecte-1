package EstructuresIterativesBucles;
Import java.util.Scanner;
public class exercici71{
    public static void main(String[]args){
        Scanner as = new Scanner(System.in);
        System.out.println("Digues numeros no nuls fins que posis el numero 0 on despres et fare un recompte de tots els que has posat tant negatius com positius");
        int quntnum;
        int cont = 0;

        while (quntnum != 0){
            if (quntnum > 0){
                cont++;
            } if (quntnum < 0){
                cont++;
            }
        } 
        
    }

}
