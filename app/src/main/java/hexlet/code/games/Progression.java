package hexlet.code.games;

import static hexlet.code.Engine.*;

import hexlet.code.Utils;

public class Progression {
    private static final int MIN_SERIES_LEN = 5;
    private static final int MAX_SERIES_LEN = 10;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;
    private static final String RULE = "What number is missing in the progression?";

    public static String generateGame(String[][] rounds) {
        for (var round : rounds) {
            int len = Utils.nextRandomInt(MIN_SERIES_LEN, MAX_SERIES_LEN);
            int step = Utils.nextRandomInt(MIN_STEP, MAX_STEP);
            int start = Utils.nextRandomInt(MAX_PLAYABLE_NUMBER);

            var series = Utils.generateRandomSeries(len, step, start);
            int guess = Utils.nextRandomInt(len);
            var questionSb = new StringBuilder();
            for (int i = 0; i < series.length; i++) {
                var format = i == guess ? ".. " : "%d ";
                questionSb.append(String.format(format, series[i]));
            }

            round[QUESTION_INDEX] = questionSb.toString().trim();
            round[ANSWER_INDEX] = String.valueOf(series[guess]);
        }
        return RULE;
    }
}
