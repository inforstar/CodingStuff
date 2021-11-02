
import java.io.PrintStream;
import java.util.Scanner;

public class Starost {
    public static void main(String[] args) {


        /*************************/
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Stevilo ena: ");
        int prvoStevilo = in.nextInt();

        out.print("Stevilo dva: ");
        int drugoStevilo = in.nextInt();

        out.print("Vsota stevil " + prvoStevilo +" in " + drugoStevilo +" je " + (prvoStevilo + drugoStevilo) + ".");




        /************************/
    }
}

