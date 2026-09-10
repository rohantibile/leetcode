class Solution {
    public int maxArea(int[] height) {
        int area = 0; int maxArea = 0;
        int start = 0;
        int end = height.length - 1;
        
        while (start < end) {
            if(height[start] <= height[end]) {
                area = height[start] * (end - start);
                start++;
            } else {
                area = height[end] * (end - start);
                end--;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}