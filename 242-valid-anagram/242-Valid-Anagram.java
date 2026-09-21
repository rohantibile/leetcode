class Solution {
    public boolean isAnagram(String s, String t) {
        //Remove white Space and convert to lowercase
        //s = s.replaceAll("\\s","").toLowerCase();
        //t = t.replaceAll("\\s","").toLowerCase();

        //if length not same then bydefault false
        if (s.length() != t.length()) return false;

        //convert, sort and compare array
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) return false;
        }
        return true;
    }
}