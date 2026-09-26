package hexlet.code.games;

import hexlet.code.Utils;
import java.util.Scanner;

public class GCD {
    public static boolean play(Scanner scanner) {
        System.out.println("Find the greatest common divisor of given numbers.");
        int streak = 0;
        while (streak != 3) {
            int number1 = Utils.nextRandomInt(100);
            int number2 = Utils.nextRandomInt(100);
            int divisor = Utils.gcd(number1, number2);
            System.out.printf("Questions: %d %d\n", number1, number2);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer != divisor) {
                System.out.printf(
                        "'%d' is wrong answer ;(. Correct answer was '%d'.\n", answer, divisor);
                return false;
            }
            System.out.println("Correct!");
            streak++;
        }
        return true;
    }
}
