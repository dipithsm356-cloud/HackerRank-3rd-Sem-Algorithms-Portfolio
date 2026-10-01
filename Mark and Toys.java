import java.util.*;

public class Solution {

    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);

        int count = 0;
        int total = 0;

        for (int price : prices) {
            if (total + price <= k) {
                total += price;
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> prices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            prices.add(sc.nextInt());
        }

        System.out.println(maximumToys(prices, k));

        sc.close();
    }
}