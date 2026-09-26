package hexlet.code.games;

import static hexlet.code.Engine.*;

import hexlet.code.Utils;

public class Calculator {
    private static final String RULE = "What is the result of the expression?";
    private static final char[] OPERATIONS = {'+', '-', '*'};

    public static String generateGame(String[][] rounds) {
        for (var round : rounds) {
            int number1 = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
            int number2 = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
            int operation = Utils.nextRandomInt(OPERATIONS.length);
            int result =
                    switch (operation) {
                        case 0 -> number1 + number2;
                        case 1 -> number1 - number2;
                        default -> number1 * number2;
                    };

            round[QUESTION_INDEX] =
                    String.format("%d %s %d", number1, OPERATIONS[operation], number2);
            round[ANSWER_INDEX] = String.valueOf(result);
        }
        return RULE;
    }
}
