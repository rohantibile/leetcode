class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String ss = str[str.length - 1];
        return ss.length();
    }
}