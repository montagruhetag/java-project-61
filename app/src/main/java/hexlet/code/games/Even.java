package hexlet.code.games;

import static hexlet.code.Engine.*;

import hexlet.code.Utils;

public class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String generateGame(String[][] rounds) {
        for (var round : rounds) {
            int number = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
            round[QUESTION_INDEX] = String.valueOf(number);
            round[ANSWER_INDEX] = number % 2 == 0 ? "yes" : "no";
        }
        return RULE;
    }
}
