class Solution {
    public int minMoves(int[] nums) {
        if (nums == null && nums.length < 2) return 0;
        
        //find minimun element from array
        int min = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
        }
        
        //calculate moves using reverse technique
        int moves = 0;
        for (int num : nums) {
            if (min < num) {
                moves += (num - min); 
            }
        }
        return moves;
    }
}