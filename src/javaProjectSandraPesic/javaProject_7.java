package javaProjectSandraPesic;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class javaProject_7 {

    // * 7) Napraviti program koji(ovaj zadatak mozda bolje uraditi u posebnoj klasi) :

    //a) Ima funkciju koja omogucava korisniku da unese u niz 6 brojeva(nebitno kojih).

    public static int[] unesiBrojeve() {
        Scanner sc = new Scanner(System.in);

        int[] niz = new int[6];

        System.out.println("Unesite brojeve od 1 do 50: ");

        for (int i = 0; i < niz.length; i++) {
            int elementi = sc.nextInt();
            niz[i] = elementi;
        }
        System.out.println();
        System.out.println("Vas niz je: ");
        return niz;
    }


    // za slucaj da stampamo niz preko funkcije

    public static void odstampajNiz(int[] niz) {


        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + ", ");
        }
        System.out.println();
    }


    //b) Funkciju koja generise nasumicnih 30 brojeva.(Ovde ce nam trebati Math.random()
    //funkcija koja generise Random broj, ali je problem sto generise jedan double broj sa dugom
    //decimalom, osmislite kako bi vi taj broj skratili i pretvorili ga u ceo broj)

    public static int[] randomBrojevi() {

        int[] niz = new int[30];

        for (int i = 0; i < niz.length; i++) {
            int elementi = ((int) (Math.random() * 50)) + 1;
            niz[i] = elementi;
        }


        System.out.println("Dobijeni niz nasumicnih brojeva je: ");

        return niz;
    }


    //c) Funkcija koja ispisuje korisniku koliko je brojeva pogodio i koje brojeve je pogodio.

    public static void bingo(int[] niz1, int[] niz2) {

        int[] veci = new int [niz1.length];
        int[] manji  = new int [niz2.length];

        if (niz1.length > niz2.length) {
           veci = new int [niz1.length];
            for (int i = 0; i < niz1.length; i++) {
                veci[i] = niz1[i];
            }

           manji = new int [niz2.length];
            for (int i = 0; i < niz2.length; i++) {
                manji[i] = niz2[i];
            }
        }
        else {
            veci = new int[niz2.length];
            for (int i = 0; i < niz2.length; i++) {
                veci[i] = niz2[i];
            }

            manji = new int[niz1.length];
            for (int i = 0; i < niz1.length; i++) {
                manji[i] = niz1[i];
            }
        }


        int brojac = 0;

        System.out.println("Brojevi koje ste pogodili su: ");

        for (int i = 0; i < manji.length; i++) {
            int trenutniElement = manji[i];
            for (int j = 0; j < veci.length; j++) {
                if (trenutniElement == veci[j]) {
                    brojac++;
                    System.out.print(trenutniElement + " ");
                    break;
                }
            }
        }

        System.out.println();
        if (brojac == 1)
                System.out.println("Pogodili ste 1 broj.");
        else if (brojac == 0)
                System.out.println("Niste pogodili nijedan broj.");
        else if (brojac > 1)
                System.out.println("Pogodili ste " + brojac + " broja.");
    }







        public static void main (String[] args ){
            Scanner sc = new Scanner(System.in);

            //stampala sam nizove u main-u, tako je preglednije

            int[] uneseniNiz = unesiBrojeve();
            for (int i = 0; i < uneseniNiz.length; i++) {
                System.out.print(uneseniNiz[i] + " ");
            }
            System.out.println();

            int[] generisaniNiz = randomBrojevi();
            for (int i = 0; i < generisaniNiz.length; i++) {
                System.out.print(generisaniNiz[i] + " ");
            }
            System.out.println();


            bingo(uneseniNiz, generisaniNiz);






        }

    }

