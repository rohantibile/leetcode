class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                res.add(num);
            }
        }

        //direct assign from set to array
        int[] result = new int[res.size()];
        int i = 0;
        for (int num : res) {
            result[i] = num;
            i++;
        }

        //covert set to array using stream
        //return res.stream().mapToInt(Integer::intValue).toArray();

        //Brute Force Code
        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < nums1.length; i++) {
        //     if (!list.contains(nums1[i])) {
        //         for (int j = 0; j < nums2.length; j++) {
        //             if (nums1[i] == nums2[j]) {
        //                 list.add(nums1[i]);
        //                 break;
        //             }
        //         }
        //     }
        // }
        // int[] result = list.stream().mapToInt(i -> i).toArray();

        return result;
    }
}