import java.util.Scanner;
public class ExerciciExtra {
    public static void main(String[] args) throws Exception{
        System.out.println("Digam un mes de l'any i te'l diré a part de dirte els dies que té");
        Scanner lector = new Scanner (System.in);
        String usuario = lector.nextLine();
        
        switch (usuario) {
            case "Gener":
            case "Març":
            case "Maig":
            case "Juliol":
            case "Agost":
            case "Octubre":
            case "Desembre":
                System.out.println("El mes té 31 dies");
                break;
            case "Febrer":
                System.out.println("El mes te 29 dies");
                break;
            case "Abril":
            case "Juny":
            case "Setembre":
            case "Novembre":
                System.out.println("El mes te 30 dies");
                break;
            default:
                System.out.println("Has posat malament el mes");
                break;
        }
        lector.close();
    }
}
