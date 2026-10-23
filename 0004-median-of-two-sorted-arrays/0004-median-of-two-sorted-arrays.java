/**
Okay I am given two sorted arrays A and B
Do i merge them first then find the median 
Or could i during the merge find the median halfway and finish

What is a median 
i be the length of combined array
median of an odd number is the i/2 rounded up )th num in array

median of even number is the i/2th  + (i/2 + 1)th num in array divide by 2
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a_len = nums1.length;
        int b_len = nums2.length;

        int total = a_len + b_len ;

        int a_ptr = 0 ;
        int b_ptr = 0 ; 

        int curr = 0 ;
        int prev = 0 ;

        for (int count = 0 ; count <= total/2 ; count++) {
            prev = curr;

            // start with the smaller element from arrays
            // the or if num2 is out of length 
            if (a_ptr < a_len && (b_ptr >= b_len ||nums1[a_ptr] <= nums2[b_ptr])) {
                curr = nums1[a_ptr];
                a_ptr++;
            }
            else{
             curr = nums2[b_ptr];
             b_ptr++;
            }
        }


        if (total%2 == 1 ) // odd total
         return (double) curr ;
        else 
         return (double) (prev + curr) / 2.0 ;
        
    }
}