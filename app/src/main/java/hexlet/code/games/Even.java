package hexlet.code.games;

import static hexlet.code.Engine.MAX_PLAYABLE_NUMBER;

import hexlet.code.Utils;

public class Even {
    public static final String GREETINGS =
            "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String question;
    public static String answer;

    public static void nextRound() {
        int number = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
        question = String.valueOf(number);
        answer = number % 2 == 0 ? "yes" : "no";
    }
}
