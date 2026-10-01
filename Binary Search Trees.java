import java.io.*;
import java.util.*;

class Result {

    public static int beautifulBinaryString(String b) {
        int count = 0;

        for (int i = 0; i <= b.length() - 3; i++) {
            if (b.substring(i, i + 3).equals("010")) {
                count++;
                i += 2;
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
            new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String b = bufferedReader.readLine();

        int result = Result.beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}