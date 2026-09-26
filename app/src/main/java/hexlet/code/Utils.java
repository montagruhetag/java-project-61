package hexlet.code;

import java.util.Scanner;

public class Utils {
    public static Scanner scanner;

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

    public static int[] generateRandomSeries(int len, int step, int start) {
        var series = new int[len];
        series[0] = start;
        for (int i = 1; i < series.length; i++) {
            series[i] = series[i - 1] + step;
        }
        return series;
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int divisor = number / 2;
        while (divisor > 1) {
            if (number % divisor == 0) {
                return false;
            }
            divisor--;
        }
        return true;
    }
}
