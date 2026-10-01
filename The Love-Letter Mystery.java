import java.io.*;
import java.util.*;

class Result {

    public static int theLoveLetterMystery(String s) {
        int operations = 0;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            int diff = Math.abs(s.charAt(left) - s.charAt(right));

            operations += diff;

            left++;
            right--;
        }

        return operations;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < q; i++) {

            String s = bufferedReader.readLine();

            int result = Result.theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
