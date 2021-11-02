
import java.io.PrintStream;
import java.util.Scanner;

public class Racunanje {
    public static void main(String[] args) {


        /*************************/
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        /*****  VHOD  ******/
        out.print("Stevilo ena: ");
        int prvoStevilo = in.nextInt();

        out.print("Stevilo dva: ");
        int drugoStevilo = in.nextInt();

        out.print("Racunski operator: ");
        String operator = in.next();


        /***** OPRAVILO   ******/
        if (operator.equals("+")) {
            out.print("Rezultat vasega racuna " + prvoStevilo + operator
                    + drugoStevilo + " je " + (prvoStevilo + drugoStevilo));
        }




        /*****  IZHOD ******/






        /************************/
    }
}

