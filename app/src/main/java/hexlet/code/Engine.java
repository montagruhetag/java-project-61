package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class Engine {
    private static final String WRONG_ANSWER_TEMPLATE =
            "'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!";

    public static final int MAX_PLAYABLE_NUMBER = 100;
    public static final int QUESTION_INDEX = 0;
    public static final int ANSWER_INDEX = 1;

    public static void start(String rule, String[][] rounds, Scanner scanner) {
        var userName = getUserName(scanner);
        System.out.println(rule);
        for (var round : rounds) {
            var answer = getAnswer(round[QUESTION_INDEX], scanner);
            if (!answer.equals(round[ANSWER_INDEX])) {
                System.out.println(
                        String.format(
                                WRONG_ANSWER_TEMPLATE, answer, round[ANSWER_INDEX], userName));
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println(String.format("Congratulations, %s!", userName));
    }

    private static String getUserName(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = scanner.next();
        System.out.println(String.format("Hello, %s!", name));
        return name;
    }

    public static String getAnswer(String question, Scanner scanner) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        return answer;
    }
}
