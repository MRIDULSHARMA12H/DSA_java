package Subarraysconcept;
import java.util.*;
public class BuyAndsellStocks {
    public static int maxProfit(int[] prices, int n) {
        int max = 0;
        int minbuy = prices[0];
        for(int i = 1; i < n; i++){
            int profit = prices[i] - minbuy;
            minbuy = Math.min(minbuy , prices[i]);
            max = Math.max(max , profit);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] price = new int[n];
        for(int i = 0 ; i< n ; i++){
            price[i] = sc.nextInt();
        }
        System.out.println(maxProfit(price , n));
    }
}
