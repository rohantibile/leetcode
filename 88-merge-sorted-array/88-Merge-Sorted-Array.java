class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Brute Code
        // int len = nums1.length;
        // if (n != 0) {
        //     int j = 0;
        //     for (int i = m; i < len; i++) {
        //         nums1[i] = nums2[j];
        //         j++;
        //     }
        //     Arrays.sort(nums1);
        // } 
        
        int i = m - 1;
        int j = n - 1;
        int pos = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[pos] = nums1[i];
                i--; 
            } else {
                nums1[pos] = nums2[j];
                j--;
            }
            pos--;
        }   
    }
}