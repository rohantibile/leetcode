class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        long moves = 0;
        while (l < r) {
            moves += (nums[r] - nums[l]);
            l++;
            r--;
        }
        //Approach 2
        // int mid = nums.length / 2;
        // long moves = 0;
        // for (int num : nums) {
        //     if (nums[mid] <= num) moves += (num - nums[mid]);
        //     else moves += (nums[mid] - num);
        // }
        return (int) moves;
    }
}