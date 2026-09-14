class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            //if stable i element get duplicate continue the iteration
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    //ignore duplicates of elements to iterates same calculations
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    //continue the iterations insides i
                    l++;
                    r--;  
                } else if (sum < 0) {
                    l++; //sum is smaller increase the number value
                } else {
                    r--; //sum is greater reduce the number value
                }
            }
        }
        return result;
    }
}