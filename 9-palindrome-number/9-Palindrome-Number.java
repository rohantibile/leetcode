class Solution {
    public boolean isPalindrome(int x) {
        int reverseN = 0;
        int a = x;
        while(a > 0){
            reverseN = reverseN * 10;
            reverseN = reverseN + a % 10;
            a = a / 10;
        }
        if(x == reverseN){
            return true;
        } else {
            return false;
        }
    }
}