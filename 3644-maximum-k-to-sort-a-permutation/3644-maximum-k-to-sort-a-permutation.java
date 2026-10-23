class Solution {
    public int sortPermutation(int[] nums) {
        // Step 1: Initialize the tracking mask for k.
        // Set 'max_k' to -1 (in binary, -1 consists of all 1-bits: ...11111111).
        // This serves as the identity element for bitwise AND operations.
        // SET max_k = -1
        int max_k = -1;
        int curr = 0;

        // Step 2: Iterate through each index of the permutation.
        // FOR index FROM 0 TO length(nums) - 1 DO:
        // SET current_value = nums[index]
        for (int i = 0; i < nums.length; i++) {
            curr = nums[i];

            if (curr != i) { // Misplaced 
                //Combine its bitwise representation into max_k using AND
                //   SET max_k = max_k AND current_value
                max_k = max_k & curr;
            }
        }

        // If the element is not at its correct position (i.e., misplaced)
        // IF current_value IS NOT EQUAL TO index THEN:
        // Combine its bitwise representation into max_k using AND
        //   SET max_k = max_k AND current_value
        // END IF
        // END FOR

        // Step 3: Return result.
        // If array was already sorted, max_k remains -1, so max(-1, 0) gives 0.
        // RETURN MAX(max_k, 0)
        return Math.max(max_k, 0);
    }
}