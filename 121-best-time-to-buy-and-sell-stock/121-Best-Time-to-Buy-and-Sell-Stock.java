class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int result = 0;
        while (r < prices.length) {
            if (l < r && prices[r] < prices[l]) {
                l++;
            } else if (l < r && prices[l] < prices[r]) {
                int count = prices[r] - prices[l];
                result = Math.max(result, count);
                r++;
            } else {
                r++;
            }
        }
        return result;
    }
}