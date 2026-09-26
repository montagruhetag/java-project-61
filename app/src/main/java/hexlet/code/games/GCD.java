package hexlet.code.games;

import static hexlet.code.Engine.*;

import hexlet.code.Utils;

public class GCD {
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static String generateGame(String[][] rounds) {
        for (var round : rounds) {
            int number1 = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
            int number2 = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
            var divisor = String.valueOf(Utils.gcd(number1, number2));

            round[QUESTION_INDEX] = String.format("%d %d", number1, number2);
            round[ANSWER_INDEX] = divisor;
        }
        return RULE;
    }
}
