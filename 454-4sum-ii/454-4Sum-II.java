class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int a : nums1) {
            for (int b : nums2) {
                int addAB = a + b;
                //In hashMap if try put duplicate key it replace value so avoid that same sum count increase by 1
                map.put(addAB, map.getOrDefault(addAB, 0) + 1);
            }
        }

        for (int c : nums3) {
            for (int d : nums4) {
                int target = -(c + d);
                count += map.getOrDefault(target, 0);
            }
        }

        return count;
    }
}