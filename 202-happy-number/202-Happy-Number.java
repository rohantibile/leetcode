class Solution {
    public boolean isHappy(int n) {
        int num = n;
        boolean check = true;
        HashSet<Integer> set = new HashSet<>();
        while (check) {
            int sum = 0;
            if (num == 1) return true; 

            while (num > 0) {  
                int digit = num % 10;
                sum += (digit * digit);
                num = num / 10;
            }

            if (set.contains(sum)) {
                check = false;
            } else {
                set.add(sum);
                num = sum;
            }
        }
        return false;
    }
}