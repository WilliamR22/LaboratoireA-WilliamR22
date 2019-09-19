import java.util.Scanner;

public class ExperienceVerte {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variables

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int co2 = 0;
        String r1;
        int k;

        ;

        //Réactions 1

        System.out.println("La quantitee de 'a' est de : ");
        a  = scan.nextInt();
        System.out.println("La quantitee de 'b' est de : ");
        b  = scan.nextInt();
        System.out.println("La quantitee de 'c' est de : ");
        c  = scan.nextInt();
        System.out.println("La quantitee de 'd' est de : ");
        d  = scan.nextInt();
        System.out.println("La quantitee de 'e' est de : ");
        e  = scan.nextInt();
        System.out.println("La quantitee de 'f' est de : ");
        f  = scan.nextInt();


        System.out.println("a = "+a+" , b = "+b+" , c = "+c+" , d = "+d+" , e = "+e+" ,  f = "+f+" ,  co2 = "+co2+" ");

        k = Math.min(a/2,b/4);

        a = a - 2 * k;
        c = c - 4 * k;
        d = d + 3 * k;
        co2 = co2 + 1 * k;

        System.out.println("a = "+a+" , b = "+b+" , c = "+c+" , d = "+d+" , e = "+e+" ,  f = "+f+" ,  co2 = "+co2+" ");

        //Réaction 2

        System.out.println("a = "+a+" , b = "+b+" , c = "+c+" , d = "+d+" , e = "+e+" ,  f = "+f+" ,  co2 = "+co2+" ");

        k = Math.min(c/2,b);

        b = b - 1 * k;
        c = c - 2 * k;
        e = e - 1 * k;
        co2 = co2 + 4 * k;
        f = f + 4 * k;

        System.out.println("a = "+a+" , b = "+b+" , c = "+c+" , d = "+d+" , e = "+e+" ,  f = "+f+" ,  co2 = "+co2+" ");

        //Réaction 3


        System.out.println("a = "+a+" , b = "+b+" , c = "+c+" , d = "+d+" , e = "+e+" ,  f = "+f+" ,  co2 = "+co2+" ");

        k = Math.min(a*2,f/4);

        a = a - k / 2;
        f = f - 4 * k;
        b = b + 1 * k;
        e = e + 4 * k;
        co2 = co2 + 1 *k;

        System.out.println("a = "+a+" , b = "+b+" , c = "+c+" , d = "+d+" , e = "+e+" ,  f = "+f+" ,  co2 = "+co2+" ");


scan.close();












    }
}
