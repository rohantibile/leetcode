class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) return 0;
        Arrays.sort(nums);
        int result = 1; int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) continue;
            if ((nums[i - 1] + 1) == nums[i]) {
                count++;
            } else {
                
                count = 1;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}