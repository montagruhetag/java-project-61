package hexlet.code.games;

import static hexlet.code.Engine.MAX_PLAYABLE_NUMBER;

import hexlet.code.Utils;

public class Calculator {
    public static final String GREETINGS = "What is the result of the expression?";
    public static String question;
    public static String answer;

    public static void nextRound() {
        var operations = new char[] {'+', '-', '*'};
        int number1 = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
        int number2 = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
        int operation = Utils.nextRandomInt(operations.length);

        question = String.format("%d %s %d", number1, operations[operation], number2);

        int result =
                switch (operation) {
                    case 0 -> number1 + number2;
                    case 1 -> number1 - number2;
                    default -> number1 * number2;
                };

        answer = String.valueOf(result);
    }
}
