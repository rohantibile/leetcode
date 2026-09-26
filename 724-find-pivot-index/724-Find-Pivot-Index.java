class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int leftTotal = 0;
        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length; i++) {
            int rightTotal = total - leftTotal - nums[i];
            if (rightTotal == leftTotal) {
                return i;
            }
            leftTotal += nums[i];
        }
        return -1;
    }
}
// Approach:
// 1. Calculate the total sum of the array.
// 2. Traverse the array while maintaining the left sum.
// 3. Calculate the right sum as:
//    total - left sum - current element.
// 4. If left sum == right sum, current index is the pivot.
// 5. If no pivot is found, return -1.