package hexlet.code.games;

import hexlet.code.Utils;
import java.util.Scanner;

public class Even {
    public static boolean play(Scanner scanner) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int streak = 0;
        while (streak != 3) {
            int number = Utils.nextRandomInt(100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            var answer = scanner.next();
            var isEven = number % 2 == 0;

            if ((answer.equals("yes") && isEven) || (answer.equals("no") && !isEven)) {
                System.out.println("Correct!");
                streak++;
                continue;
            }

            System.out.printf(
                    "'%s' is wrong answer ;(. Correct was '%s'.\n", answer, isEven ? "yes" : "no");
            return false;
        }
        return true;
    }
}
