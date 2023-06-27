package javaProjectSandraPesic;

import java.util.Scanner;

public class javaProject_1_do_6 {

    //1) Napraviti funkciju koja kao argument prima niz Stringova, i String koji zelimo da lociramo
    // u tom nizu. Kao rezultat vratiti true/false ukoliko se nalazi/ne nalazi u nizu.


    public static boolean find(String rec, String[] niz) {
        boolean b = true;

        for (int i = 0; i < niz.length; i++) {

            if (niz[i].equalsIgnoreCase(rec)) {
                b = true;
                break;

            } else b = false;

        }

        return b;
    }


    // 2) Napraviti funkciju koja prima niz celih brojeva i kao rezultat vraca novi niz gde je svaki
    // element pomnozen sa Pi.

    public static void ispisNiza(double[] niz) {

        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + ", ");

        }
    }


    public static double[] pomnozenoSaPI(int[] brojevi) {

        double[] noviNiz = new double[brojevi.length];

        System.out.println("Novi niz je: ");

        for (int i = 0; i < brojevi.length; i++) {
            noviNiz[i] = brojevi[i] * Math.PI;

        }

        return noviNiz;

    }


    // 3) Napraviti funkciju koja ce za prosledjeni String obrnuti redosled karaktera.

    public static String reverse(String rec) {

        String obrnutaRec = "";

        for (int i = rec.length() - 1; i >= 0; i--) {

            char karakteri = rec.charAt(i);
            obrnutaRec += karakteri;


        }
        return obrnutaRec;
    }


    // 4) Napraviti funkciju koja ce primati niz Stringova, String koji zelimo da zamenimo, i String
    // sa kojim zelimo da ga zamenimo u tom nizu.

    public static void replaceWith(String[] niz, String oldString, String newString) {

        for (int i = 0; i < niz.length; i++) {

            if (niz[i].equalsIgnoreCase(oldString)) {
                niz[i] = (newString);
                break;
            }

            System.out.println("Novonastali niz je: ");

        }
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i] + ", ");

        }


    }

    // 5) Napraviti funkciju koja prima String, String zapis ce biti u vidu nekog broja(npr "123",
    // "741",..), funkcija treba ovaj String da pretvori u ceo broj i da ispise svaki broj koji je deljiv
    // sa tim brojem.

    public static void deljivSa(String broj) {

        int brojString = Integer.parseInt(broj);

        System.out.println("Brojevi sa kojima je taj broj deljiv su: ");

        for (int i = 1; i <= brojString; i++) {

            if (brojString % i == 0)
                System.out.print(i + ", ");

        }

    }

    // 6) Napraviti funkciju koja prima dva niza celih brojeva(ne moraju da budu iste velicine),
    //porediti svaki broj na istoj poziciji i u zavisnosti od toga koji je veci dodati ga u rezultujuci
    //niz, ako jednom nizu ponestane elemenata za poredjenje sa drugim nizom, samo ispisati
    //preostale elemente.

    public static int[] najveci(int[] niz1, int[] niz2) {

        int[] noviNiz = new int[niz1.length];

        if (niz1.length > niz2.length) {
            noviNiz = new int[niz1.length];

            for (int i = 0; i < niz2.length; i++) {
                if (niz1[i] > niz2[i]) {
                    noviNiz[i] = niz1[i];
                }
                else
                    noviNiz[i] = niz2[i];
            }
            for (int i = niz2.length; i < noviNiz.length; i++) {
                noviNiz[i] = niz1[i];

            }

        } else if (niz1.length < niz2.length) {

            noviNiz = new int[niz2.length];

            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] > niz2[i]) {
                    noviNiz[i] = niz1[i];
                }
                else
                    noviNiz[i] = niz2[i];

            }
            for (int i = niz1.length; i < noviNiz.length; i++) {
                noviNiz[i] = niz2[i];

            }

        }
        return noviNiz;
    }


    public static void ispisiNiz (int[] niz) {

                System.out.println("Novonastali niz je: ");

                for (int i = 0; i < niz.length; i++) {
                    System.out.print(niz[i] + " ");

                }
            }




























    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int[] niz1 = {2, 4, 6, 7, 15};

        int[] niz2 = {2, 8, 7, 4, 1, 7, 14, 2};

        ispisiNiz(najveci(niz1, niz2));

    }
}
