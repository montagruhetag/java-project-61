package hexlet.code.games;

import static hexlet.code.Engine.MAX_PLAYABLE_NUMBER;

import hexlet.code.Utils;

public class Prime {
    public static final String GREETINGS =
            "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String question;
    public static String answer;

    public static void nextRound() {
        int number = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
        question = String.valueOf(number);
        boolean isPrime = Utils.isPrimeNumber(number);
        answer = isPrime ? "yes" : "no";
    }
}
