package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var games = new String[] {"Exit", "Greet"};
        for (int i = 0; i < games.length; i++) {
            System.out.printf("%d - %s\n", i, games[i]);
        }

        var scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Cli.greeting();
                break;
        }
        scanner.close();
    }
}
