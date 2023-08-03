package target;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int var1 = prices[0];
        int var2 = 0;

        for (int i = 0, j = 1; j < prices.length; j++) {
            if (var1 > prices[j]) {
                var1 = prices[j];
                i = j;
                continue;
            }

            var2 = var2 < prices[j] - prices[i] ?
                    prices[j] - prices[i] : var2;
        }
        return var1;
    }
}
