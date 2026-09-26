package hexlet.code;

public class Utils {
    public static int nextRandomInt(int max) {
        return nextRandomInt(0, max);
    }
    
    public static int nextRandomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
