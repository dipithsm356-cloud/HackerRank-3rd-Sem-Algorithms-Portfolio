import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        long sum = 0;
        int min = arr.get(0);
        int max = arr.get(0);

        for (int num : arr) {
            sum += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        long minSum = sum - max;
        long maxSum = sum - min;

        System.out.println(minSum + " " + maxSum);
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(
                bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")
            )
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}