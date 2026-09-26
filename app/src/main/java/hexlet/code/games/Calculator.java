package hexlet.code.games;

import hexlet.code.Utils;
import java.util.Scanner;

public class Calculator {
    public static boolean play(Scanner scanner) {
        var operations = new char[] {'+', '-', '*'};
        System.out.println("What is the result of the expression?");
        int streak = 0;
        while (streak != 3) {
            int number1 = Utils.nextRandomInt(100);
            int number2 = Utils.nextRandomInt(100);
            int operation = Utils.nextRandomInt(operations.length);
            int result =
                    switch (operation) {
                        case 0 -> number1 + number2;
                        case 1 -> number1 - number2;
                        default -> number1 * number2;
                    };

            System.out.printf("Question: %d %s %d\n", number1, operations[operation], number2);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer != result) {
                System.out.printf(
                        "'%d' is wrong answer ;(. Correct answer was '%d'.\n", answer, result);
                return false;
            }
            System.out.println("Correct!");
            streak++;
        }
        return true;
    }
}
