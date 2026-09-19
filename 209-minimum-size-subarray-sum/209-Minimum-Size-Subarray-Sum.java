class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, sumOfCurrWindow = 0;
        int res = Integer.MAX_VALUE;
        //window size increasing while r moves to right
        for (int r = 0; r < nums.length; r++) {
            //window total
            sumOfCurrWindow += nums[r];
            //if target match or greater than target shrink window from left
            while (sumOfCurrWindow >= target) {
                res = Math.min(res, r - l + 1);
                sumOfCurrWindow -= nums[l];
                l++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}