import java.util.HashSet;

/**
The Sliding window concept
adding a new substring to make the window grow larger
what happens when we find a duplicate ?
create a new window ?
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
    int left = 0 ;
    int maxLength = 0;

    HashSet<Character> charset = new HashSet<>(); // I have created a hashset for all chars

    for(int r = 0 ; r < s.length(); r++)
    {
        // If we found a char that is already in the window , we shrink the window until we have remove the dup char thats why it is in a while loop
        while(charset.contains(s.charAt(r))){
            charset.remove(s.charAt(left));
            left++;
        }

        charset.add(s.charAt(r));
        maxLength = Math.max(maxLength, r - left + 1);
    }
    return maxLength;
        
    }
}