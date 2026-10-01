import java.io.*;
import java.util.*;

class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {

        int max = 0;
        int count = 0;

        for (int candle : candles) {
            if (candle > max) {
                max = candle;
                count = 1;
            } else if (candle == max) {
                count++;
            }
        }

        return count;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(
            bufferedReader.readLine().trim()
        );

        String[] candlesTemp =
            bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < candlesCount; i++) {
            candles.add(Integer.parseInt(candlesTemp[i]));
        }

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}