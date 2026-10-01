import java.io.*;
import java.util.*;

class Result {

    public static String timeConversion(String s) {

        String period = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour = hour + 12;
            }
        }

        return String.format("%02d%s", hour, s.substring(2, 8));
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}