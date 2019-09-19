import java.text.DecimalFormat;
import java.util.Scanner;

public class Convertisseur2 {

    public static void main(String[] args)  {

        //Variables

        int degre;
        double radian;


        Scanner scan = new Scanner (System.in);

        //Valeurs de degre


        DecimalFormat decimalFormat = new DecimalFormat ( "###.##");

        System.out.println("Quel est l'angle en degre? " );

       degre = scan.nextInt();

        radian= Math.toRadians (degre);

        //Valeurs de radian


        System.out.println("Valeur en radian: " + radian);

        System.out.println( "Valeur en radian formatee: " + decimalFormat.format(radian));


        scan.close();
    }














}













