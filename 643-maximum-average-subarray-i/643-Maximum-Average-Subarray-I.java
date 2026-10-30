class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        double result = 0.0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int left = 0;
        int right = k; //4
        int sum = windowSum; //2
        while (right < nums.length) {
            sum = sum - nums[left] + nums[right];
            if (sum > windowSum) {
                windowSum = sum;
            }
            left++;
            right++;
        }
        return result = (double) windowSum / k;
    }
}