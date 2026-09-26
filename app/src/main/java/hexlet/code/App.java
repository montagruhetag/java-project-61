package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var games = new String[] {"Exit", "Greet", "Even", "Calc"};
        for (int i = 0; i < games.length; i++) {
            System.out.printf("%d - %s\n", i, games[i]);
        }

        var scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Cli.greet(scanner);
                break;
            case 2:
                Cli.greet(scanner);
                Even.play(scanner);
                break;
            case 3:
                Cli.greet(scanner);
                Calculator.play(scanner);
        }
        scanner.close();
    }
}
