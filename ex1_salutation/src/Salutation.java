
import java.util.Scanner;

public class Salutation {

    public static void main(String[] args) {

        //Variable


        Scanner scan = new Scanner(System.in);

        String a = "William";

        System.out.println("Quel est ton nom?"+" " + a);

        System.out.println("Bonjour, " + a);



        scan.close();

    }
}