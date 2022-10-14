import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        System.out.println("Bonjour, quel est votre prénom ?");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        System.out.println("Veuillez entrer un entier puis un réel");
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
        somme();
        division();
        volume();
    }

//affiche :
// j'ai recupere un entier : 12
// j'azi aussi recupere un reel : 2.3
// process finished with exit code 0

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + "est egale a " + somme);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier + "est egale a " + division);
    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le troisieme entier");
        int troisiemeEntier = scanner.nextInt();
        int volume = premierEntier * deuxiemeEntier * troisiemeEntier;
        System.out.println("Le volume de" + premierEntier + " avec " + deuxiemeEntier + "avec" + troisiemeEntier+ "est egale a " + volume);
    }
}

