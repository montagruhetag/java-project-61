package hexlet.code;

import hexlet.code.games.*;

public class Engine {
    public static String[] games = {"Even", "Calc", "GCD", "Progression", "Prime"};

    public static final int MAX_PLAYABLE_NUMBER = 100;
    private static int selectedGame = 0;
    private static final int MAX_STREAK = 3;
    private static final String WRONG_ANSWER_TEMPLATE =
            "'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!\n";

    public static void start() {
        System.out.println(getGreetings());
        int streak = 0;
        while (streak != MAX_STREAK) {
            nextRound();
            var question = getQuestion();
            var answer = getAnswer(question);
            var correctAnswer = getCorrectAnswer();
            if (!answer.equals(correctAnswer)) {
                System.out.printf(WRONG_ANSWER_TEMPLATE, answer, correctAnswer, Cli.name);
                return;
            }
            streak++;
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s!\n", Cli.name);
    }

    public static String getGreetings() {
        return switch (selectedGame) {
            case 0 -> Even.GREETINGS;
            case 1 -> Calculator.GREETINGS;
            case 2 -> GCD.GREETINGS;
            case 3 -> Progression.GREETINGS;
            case 4 -> Prime.GREETINGS;
            default -> null;
        };
    }

    private static String getQuestion() {
        return switch (selectedGame) {
            case 0 -> Even.question;
            case 1 -> Calculator.question;
            case 2 -> GCD.question;
            case 3 -> Progression.question;
            case 4 -> Prime.question;
            default -> null;
        };
    }

    private static String getCorrectAnswer() {
        return switch (selectedGame) {
            case 0 -> Even.answer;
            case 1 -> Calculator.answer;
            case 2 -> GCD.answer;
            case 3 -> Progression.answer;
            case 4 -> Prime.answer;
            default -> null;
        };
    }

    private static void nextRound() {
        switch (selectedGame) {
            case 0 -> Even.nextRound();
            case 1 -> Calculator.nextRound();
            case 2 -> GCD.nextRound();
            case 3 -> Progression.nextRound();
            case 4 -> Prime.nextRound();
        }
    }

    public static String getAnswer(String question) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String answer = Utils.scanner.next();
        return answer;
    }

    public static void setGame(int game) {
        selectedGame = game;
    }
}
