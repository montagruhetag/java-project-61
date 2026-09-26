package hexlet.code;

public class Cli {
    public static String name;

    public static void greet() {
        var scanner = Utils.scanner;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.next();
        System.out.println(String.format("Hello, %s!%n", name));
    }
}
