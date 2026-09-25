package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        var scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        var name = scanner.next();
        System.out.printf("Hello, %s!%n", name);
        scanner.close();
    }
}
