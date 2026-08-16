// NeetCode 3
//Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//SOLUTION
class Solution {
    public boolean isAnagram(String s, String t) {
        int sl= s.length(), tl= t.length();
        if(tl!=sl)
        return false;
        else
        {
            char[] sSort = s.toCharArray();
            char[] tSort= t.toCharArray();
            Arrays.sort(sSort);
            Arrays.sort(tSort);
            return Arrays.equals(sSort,tSort);


        }

    }
}
