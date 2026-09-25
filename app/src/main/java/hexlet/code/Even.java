package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void play(Scanner scanner) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int streak = 0;
        while (streak != 3) {
            int number = (int) (Math.random() * 101);
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
            System.out.printf("Let's try again, %s!\n", Cli.name);
            return;
        }
        System.out.printf("Congratulations, %s!\n", Cli.name);
    }
}
