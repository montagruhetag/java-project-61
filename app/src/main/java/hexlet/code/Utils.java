package hexlet.code;

public class Utils {
    public static int nextRandomInt(int to) {
        return (int) (Math.random() * (to + 1));
    }

    public static int gcd(int number1, int number2) {
        int divisor = Math.min(number1, number2);
        while (divisor > 1) {
            if (number1 % divisor == 0 && number2 % divisor == 0) {
                return divisor;
            }
            divisor--;
        }
        return divisor;
    }
}
