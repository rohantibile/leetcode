class Solution {
    public int[] sortedSquares(int[] nums) {
        // Brute Code
        // int n = nums.length;
        // int[] result = new int[n];
        // int i = 0;
        // for (int num : nums) {
        //     result[i] = num * num;
        //     i++;
        // }
        // Arrays.sort(result);
        // return result;

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return result;
    }
}