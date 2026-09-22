class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Map to store key and value
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            //Array for creating key
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);
            //If exist put string in existing key else create new key and arraylist
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(str);
        }
        return new ArrayList<>(map.values());
    }
}