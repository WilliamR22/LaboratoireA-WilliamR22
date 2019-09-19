import java.util.Scanner;

public class Geometrie {

public static void main(String[] argv) {

    Scanner scan = new Scanner(System.in);

    float rayon, longueur, hauteur, surface, volume, apotheme;



    //Cercle

    rayon = 10;

    surface = (float) (Math.PI * Math.pow(rayon, 2));

    System.out.println("Le cercle");

    System.out.println("-Rayon : " + rayon );

    System.out.println("-Surface : " + surface);

    //Cube

    longueur = 7;

    surface = (longueur * longueur *6);

    volume = (float) Math.pow (longueur, 3);

    System.out.println("Le cube");

    System.out.println("-longueur : " + longueur);

    System.out.println("-surface : " + surface);

    System.out.println("-volume : " + volume);


    //Cylindre

    rayon = 10;

    hauteur = 5;

    surface = (float) (Math.pow (rayon , 2) * Math.PI * 2 + 2 * Math.PI * rayon * hauteur )  ;

    volume = (float) (Math.pow (rayon , 2) * Math.PI * hauteur ) ;

    System.out.println("Le cylindre");

    System.out.println("-rayon : " + rayon);

    System.out.println("-hauteur : " + hauteur);

    System.out.println("-surface : " + surface);

    System.out.println("-volume : " + volume);

    //Cone

    rayon = 3;

    hauteur = 7;

    apotheme = (float) Math.sqrt (Math.pow( hauteur , 2) + (Math.pow ( rayon , 2)));

    surface = (float) (Math.PI * rayon * apotheme + Math.PI * Math.pow ( rayon , 2));

    volume = (float) (Math.PI * Math.pow ( rayon , 2) * hauteur / 3);

    System.out.println("Le cone");

    System.out.println("-rayon : " + rayon);

    System.out.println("-hauteur : " + hauteur);

    System.out.println("-apotheme : " + apotheme);

    System.out.println("-surface : " + surface);

    System.out.println("-volume : " + volume);


    scan.close();
}















}