package EstructuresIterativesBucles;

public class apunts {
    public static void main(String[] args) throws Exception {
        int aforo = 0;
        final int AFORO_MAX = 3;
        
        while (aforo < AFORO_MAX){
            System.out.println("dejar entrar");
            aforo++; // guarada el valor i incrementa
            //++aforo; // incrementa el valor i guarda
            System.out.println("Hi han " + aforo + " persones en el concierto" );
        }
        System.out.println("Estamos llenos");
        
    }
}
