import java.util.Scanner;

public class Resolution {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        //Variables

        double a;
        double b;
        double c;
        double d;
        double x1;
        double x2;

        //Calculs

        System.out.println("Quelle est la valeure de 'a' : " );
        a= scan.nextInt();
        System.out.println("Quelle est la valeure de 'b' : ");
        b= scan.nextInt();
        System.out.println("Quelle est la valeure de 'c' : " );
        c= scan.nextInt();

        d = Math.sqrt ( Math.pow( b , 2) - (4 * a * c ));

         x1 = (-b - d)  / (2 * a);
         x2 = (-b + d) / (2 * a);

         //Fin

        System.out.println("La valeur de x1 est : " + x1 );
        System.out.println("La valeur de x2 est : " + x2 );



         scan.close();




    }
}
