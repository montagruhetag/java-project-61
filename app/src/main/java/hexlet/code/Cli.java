package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = scanner.next();
        System.out.println(String.format("Hello, %s!", name));
    }
}
