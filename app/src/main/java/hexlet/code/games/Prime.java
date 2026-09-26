package hexlet.code.games;

import static hexlet.code.Engine.*;

import hexlet.code.Utils;

public class Prime {
    private static final String RULE =
            "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String generateGame(String[][] rounds) {
        for (var round : rounds) {
            int number = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
            round[QUESTION_INDEX] = String.valueOf(number);
            boolean isPrime = Utils.isPrimeNumber(number);
            round[ANSWER_INDEX] = isPrime ? "yes" : "no";
        }
        return RULE;
    }
}
