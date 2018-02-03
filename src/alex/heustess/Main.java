package alex.heustess;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        regular();
        paul();
    }

    private static void paul() {
        FortuneTeller paulTheOctopus = new FortuneTeller("paulAnswer.txt");
        System.out.println("Paul is hungry!\n"
                + "Think about which world cup you would like to have Paul prophesize\n"
                + "and hit enter for your reply. \n\t(q to quit)");

        while (!scanner.nextLine().toLowerCase().contains("q")) {
            paulTheOctopus.getFortune();
            System.out.println("Try again?");
        }
    }

    private static void regular() {
        FortuneTeller fortuneTeller = new FortuneTeller();
        System.out.println("The fortune teller is ready for you \n"
                + "Please think about your questions in your mind\n"
                + "and hit enter for your reply");

        while (!scanner.nextLine().toLowerCase().contains("q")) {
            fortuneTeller.getFortune();
            System.out.println("Do you have another question?");
        }
    }

}
