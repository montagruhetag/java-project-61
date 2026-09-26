package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    public static void menu() {
        var games = new String[] {"Exit", "Greet", "Even", "Calc"};
        for (int i = 0; i < games.length; i++) {
            System.out.printf("%d - %s\n", i, games[i]);
        }

        var scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int input = scanner.nextInt();
        if (input == 0) {
            System.exit(0);
        }
        
        Cli.greet(scanner);
        
        boolean isWin = switch (input) {
            case 2 -> Even.play(scanner);
            case 3 -> Calculator.play(scanner);
            default -> false;
        };
        
        var messageFormat = isWin ? "Congratulations, %s!\n" : "Let's try again, %s!\n";
        System.out.printf(messageFormat, Cli.name);
        scanner.close();
    }
}
