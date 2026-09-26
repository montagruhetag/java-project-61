package hexlet.code.games;

import static hexlet.code.Engine.MAX_PLAYABLE_NUMBER;

import hexlet.code.Utils;

public class GCD {
    public static final String GREETINGS = "Find the greatest common divisor of given numbers.";
    public static String question;
    public static String answer;

    public static void nextRound() {
        int number1 = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
        int number2 = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);
        var divisor = String.valueOf(Utils.gcd(number1, number2));
        question = String.format("%d %d", number1, number2);
        answer = String.valueOf(divisor);
    }
}
