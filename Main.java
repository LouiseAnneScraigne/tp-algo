import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.time.*;

public class Main {

    public static int SIZE = Integer.MAX_VALUE/100;
    public static int[] tableau = new int[SIZE];

    public static void main(String[] args){
        System.out.println("Bonjour, quel est votre prénom ?");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        System.out.println("Enchanté, le code va débuter");

        int[] tableauSelection = new int[SIZE];
        // arraycopy(src, startIndex, dest, startIndex, size)
        System.arraycopy(tableau, 0, tableauSelection, 0, SIZE);

        int[] tableauInsertion = new int[SIZE];
        System.arraycopy(tableau, 0, tableauInsertion, 0, SIZE);

        int[] tableauBulles = new int[SIZE];
        System.arraycopy(tableau, 0, tableauBulles, 0, SIZE);

        initialiserTableau();
        triSelection(tableauSelection);
        triInsertion(tableauInsertion);
        triBulles(tableauBulles);
    }

    public static void initialiserTableau() {
        Instant start = Instant.now();
        System.out.println("Debut d’initialisation...");
        Random random = new Random();
        int[] tableau = new int[0];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(SIZE);
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’initialisation a pris " + duration + " ms");
    }

    public static void triSelection(int[] tableau) {
        System.out.println("[Tri par selection]");
        Instant start = Instant.now();

        for (int i = 0; i < tableau.length - 1; i++);
        int i = 0;
        int indiceMin = i;

        for (int j = i; j < tableau.length; j++){
            if (tableau[j] < tableau[indiceMin]) {
                indiceMin = j;
            }
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’execution a pris " + duration + " ms");
    }

    public static void triInsertion(int[] tableau) {
        System.out.println("[Tri par insertion]");
        Instant start = Instant.now();

        for (int i = 0 ; i < tableau.length ; i++) {
            int elementATrier = tableau[i] ;
            int j = i ;

            while (j > 0 && tableau[j-1] > elementATrier) {
                tableau[j] = tableau[j-1] ;
                j-- ;
            }
            tableau[j] = elementATrier ;
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’execution a pris " + duration + " ms");
    }

    public static void triBulles(int[] tableau2) {
        System.out.println("[Tri à bulles]");
        Instant start = Instant.now();
        boolean estTrie = false;

        while (estTrie) {
            estTrie = true;
            for (int i = 1; i < tableau2.length; i++) {
                if (tableau2[i - 1] > tableau2[i]) {
                    int swap = tableau2[i - 1];
                    tableau2[i - 1] = tableau2[i];
                    tableau2[i] = swap;
                    estTrie = false;
                    System.out.println("ok");
                }
            }
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’execution a pris " + duration + " ms");
    }

}