import java.util.Scanner;

public class Typage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Mes Variables

        int var1;

        float var2;

        char var3;

        // Conversions #1

        var1 = (int) 9;

        String.valueOf(var1);

        System.out.println("Conversion#1 : " + var1);

        //Conversion #2

        var1 = (int) 9  ;

        boolean b =( var1 == 9  );

         System.out.println("Conversion#2 : " + var1 + " , "+b);

         //Conversion #3

        var2 =  (float) 5.5;

       var2 = Math.round(var2);

        System.out.println("Conversion#3 : " + var2);

        //Conversion#4

        String.valueOf(var2);

        System.out.println("Convesion#4 : " + var2);

        //Conversion#5

        var3 = '5';

        int I = var3 - '0';

        System.out.println("Conversion#5 : " + I);

        //Fin


        scan.close();







;







    }
}
