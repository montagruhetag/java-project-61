package hexlet.code.games;

import hexlet.code.Utils;
import java.util.Scanner;

public class Prime {
    public static boolean play(Scanner scanner) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int streak = 0;
        while (streak != 3) {
            int number = Utils.nextRandomInt(100);
            System.out.printf("Question: %d\n", number);
            System.out.print("Your answer: ");
            var answer = scanner.next();
            boolean isPrime = Utils.isPrimeNumber(number);
            if ((answer.equals("yes") && isPrime) || (answer.equals("no") && !isPrime)) {
                streak++;
                System.out.println("Correct!");
            } else {
                System.out.printf(
                        "'%s' is wrong answer ;(. Correct answer was '%s'.\n",
                        answer, isPrime ? "yes" : "no");
                return false;
            }
        }
        return true;
    }
}
