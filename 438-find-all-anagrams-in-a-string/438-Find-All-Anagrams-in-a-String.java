class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) return result;

        int[] pmap = new int[26];
        int[] smap = new int[26];

        // Build frequency arrays
        for (int i = 0; i < p.length(); i++) {
            pmap[p.charAt(i) - 'a']++;
            smap[s.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(pmap, smap)) {
            result.add(0);
        }

        // Sliding window
        for (int i = p.length(); i < s.length(); i++) {

            // Remove outgoing character
            smap[s.charAt(i - p.length()) - 'a']--;

            // Add incoming character
            smap[s.charAt(i) - 'a']++;

            if (Arrays.equals(pmap, smap)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }
}