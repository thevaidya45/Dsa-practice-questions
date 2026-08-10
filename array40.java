import java.util.*;

class array40 {

    public static int profit(int[] price) {

        int min = price[0];
        int maxProfit = 0;

        for (int i = 1; i < price.length; i++) {
            if (price[i] < min) {
                min = price[i];
            }
            int currentProfit = price[i] - min;

       
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(profit(prices));
    }
}