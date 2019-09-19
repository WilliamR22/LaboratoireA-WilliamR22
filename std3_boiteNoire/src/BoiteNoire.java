import java.util.Scanner;

public class BoiteNoire {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        //Variables de la sphere

        double poidS;
        double volumeS;
        double masseVolumiqueS = 3517;
        double rayonS = 2.15;

       //Calcules pour la sphere

     volumeS = (4 * Math.PI * Math.pow( rayonS, 3) / 3);

     poidS = volumeS * masseVolumiqueS;

     //Variables de la boite

        double poidB = 375;
        double dimensionB = 125;

        //Varibales substance isolante

        double masseVolumeSI = 13545.88;
        double poidSI;
        double volumeSI;
        double quantiteSI;

        //Calcules pour la substance

        volumeSI = dimensionB - volumeS;
        poidSI= volumeSI * masseVolumeSI;
        quantiteSI = volumeSI * 1000;

        //Poids Total!!!

        double poidTotal;

       poidTotal = poidB + poidS + poidSI ;


        // Affichage du rapport d'informations
        System.out.println("-------------------------------------------");
        System.out.println("- RAPPORT D'INFORMATIONS");
        System.out.println(" Sphere");
        System.out.println(" * Masse volumique : " + masseVolumiqueS + " kg/m3");
        System.out.println(" * Poids : " + poidS + " kg");
        System.out.println(" * Rayon : " + rayonS + " m");
        System.out.println(" * Volume : " + volumeS + " m3");
        System.out.println(" Substance isolante");
        System.out.println(" * Masse volumique : " + masseVolumeSI + " kg/m3");
        System.out.println(" * Poids : " + poidSI + " kg");
        System.out.println(" * Volume : " + volumeSI + " m3");
        System.out.println(" * Quantite : " + quantiteSI + " l");
        System.out.println(" Boite noire");
        System.out.println(" * Poids : " + poidB + " kg");
        System.out.println(" * Volume : " + dimensionB + " m3");
        System.out.println(" * Poids total : " + poidTotal + " kg");
        System.out.println("-------------------------------------------");

        scan.close();























    }












}



