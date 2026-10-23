class Solution {
    public String longestPalindrome(String s) {

        // Base case : return empty string if input is null or empty
        if (s == null || s.length() < 1) {
            return "";
        }
        // Initialize Start and End indexes
        int start = 0;
        int end = 0;

        // Create a loop to iterate through String
        for (int i = 0; i < s.length(); i++) {
            // Check for odd length palindrome from center of string (i)
            int len_odd = expandAroundCenter(s, i, i);
            // Check for even length palindrome from center of string (i,i+1)
            int len_even = expandAroundCenter(s, i, i + 1);
            // Get the max len between the two
            int len_max = Math.max(len_odd, len_even);

            // If a longer Palindrome is found we update the start and end index to show the longest palindrom that was found
            if (len_max > (end - start)) {
                start = i - (len_max - 1) / 2;
                end = i + len_max / 2;
            }

        }
        // Extract and return the start and end index+1 
        return s.substring(start, end + 1);
    }

    // Helper Function to help expand palindrome from center
    // ExpandAroundCenter(String x, int a, int b)
    private int expandAroundCenter(String s, int left, int right){
        
    // Create a loop to iterate from middle not to go out of bounds and do comparison
    while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ){
    // Check for left >= 0. and right <  s.length() , l_char = r_char
    left--;
    right++;
    // L-- ;, R++;
    }

    // Return r-l-1 --> size of palindrome
    return right-left- 1;
    }

}