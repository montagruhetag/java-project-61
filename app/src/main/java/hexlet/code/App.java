package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    private static final int MAX_MENU_NUMBER = 6;
    private static final int MIN_MENU_NUMBER = 0;
    private static final int MAX_ROUNDS = 3;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println(
                """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit""");

        System.out.print("Your choice: ");
        String input = scanner.next();
        int number = Integer.parseInt(input);
        if (number <= MIN_MENU_NUMBER || number > MAX_MENU_NUMBER) {
            System.exit(0);
        }

        if (number == 1) {
            Cli.greet(scanner);
            System.exit(0);
        }

        var rounds = new String[MAX_ROUNDS][2];
        var rule =
                switch (number) {
                    case 2 -> Even.generateGame(rounds);
                    case 3 -> Calculator.generateGame(rounds);
                    case 4 -> GCD.generateGame(rounds);
                    case 5 -> Progression.generateGame(rounds);
                    case 6 -> Prime.generateGame(rounds);
                    default -> null;
                };

        if (rule == null) {
            System.exit(0);
        }

        Engine.start(rule, rounds, scanner);
        scanner.close();
    }
}
