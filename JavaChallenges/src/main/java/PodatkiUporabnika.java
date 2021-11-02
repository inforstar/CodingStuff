
import java.io.PrintStream;
import java.util.Scanner;

public class PodatkiUporabnika {
    public static void main(String[] args) {


        /*************************/
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Vpisite ime: ");
        String ime = in.nextLine();


        out.print("Vpisite priimek: ");
        String priimek = in.nextLine();


        out.print("Vpisite datum rojstva: ");
        String rojstva = in.nextLine();


        out.print("Vpisite kraj kjer ste se rodili: ");
        String rodili = in.nextLine();


        out.print("Vpisite kraj kjer danes zivite: ");
        String zivite = in.nextLine();


        out.print("Vi ste uporabnik " +  ime +" " + priimek +". Rojeni ste " + rojstva +" v kraju " + rodili +" in zivite v kraju " + zivite +".");

        /************************/
    }
}

