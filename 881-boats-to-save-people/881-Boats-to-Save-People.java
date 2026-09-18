class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        int l = 0; 
        int r = people.length - 1;
        Arrays.sort(people);
        while (l <= r) {
            //if total weight less or same both pointers moves
            if (people[l] + people[r] <= limit) l++;
            //heaviest person always get a boat
            r--;
            boats++;
        }
        return boats;
    }
}