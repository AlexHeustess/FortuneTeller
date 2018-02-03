package alex.heustess;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;


public class FortuneTeller {
    private ArrayList<String> answers = new ArrayList<>();
    private static Random random = new Random();
    File inputFile = new File("answers.txt");

    FortuneTeller() {
        readAnswers();
    }

    FortuneTeller(String fileName) {
        inputFile = new File(fileName);
        readAnswers();
    }


    void getFortune() {
        System.out.printf("The fortune teller says: \"%s\"\n", getRandomResponse());
    }

    private String getRandomResponse() {
        return answers.get(random.nextInt(answers.size()));
    }

    private void readAnswers() {
        String answer;
        try (Scanner input = new Scanner(inputFile)) {
            while (input.hasNextLine()) {
                answer = input.nextLine();
                answers.add(answer);
            }
        } catch (IOException e) {
            System.err.println("IOException getting answers from " + inputFile.getName() + "\n" + e.toString());
        }
    }

}
