package hexlet.code.games;

import hexlet.code.Utils;
import java.util.Scanner;

public class Progression {
    public static boolean play(Scanner scanner) {
        System.out.println("What number is missing in the progression?");
        int streak = 0;
        while (streak != 3) {
            int len = Utils.nextRandomInt(5, 10);
            int step = Utils.nextRandomInt(1, 10);
            int start = Utils.nextRandomInt(100);
            var series = Utils.generateRandomSeries(len, step, start);
            int guess = Utils.nextRandomInt(len);
            System.out.print("Question:");
            for (int i = 0; i < series.length; i++) {
                var format = i == guess ? " .." : " %d";
                System.out.printf(format, series[i]);
            }

            System.out.print("\nYour answer: ");
            int answer = scanner.nextInt();
            if (answer != series[guess]) {
                System.out.printf(
                        "'%d' is wrong answer ;(. Correct answer was '%d'.\n",
                        answer, series[guess]);
                return false;
            }
            streak++;
            System.out.println("Correct!");
        }
        return true;
    }
}
