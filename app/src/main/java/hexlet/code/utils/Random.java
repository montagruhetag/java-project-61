package hexlet.code.utils;

public class Random {
    public static int nextInt(int to) {
        return (int) (Math.random() * (to + 1));
    }
}
