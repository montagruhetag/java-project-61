package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Utils.scanner = new Scanner(System.in);

        int gamesOffset = 2; // offset for control options (Exit, Greet)

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        var games = Engine.games;
        for (int i = 0; i < games.length; i++) {
            System.out.println(String.format("%d - %s", i + gamesOffset, games[i]));
        }
        System.out.println("0 - Exit");

        var scanner = Utils.scanner;

        System.out.print("Your choice: ");
        String input = scanner.next();
        int parsedInput = Integer.parseInt(input);
        if (parsedInput == 0 || parsedInput >= games.length + gamesOffset) {
            System.exit(0);
        }

        Cli.greet();
        if (parsedInput == 1) {
            System.exit(0);
        }

        Engine.setGame(parsedInput - gamesOffset);
        Engine.start();

        Utils.scanner.close();
    }
}
