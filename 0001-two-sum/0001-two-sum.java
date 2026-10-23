class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        int[] ansIndex = new int[2];
        for (int i = 0; i < nums.length; i++) {

            

                ansIndex[0] = i;
                for (int x = i+1; x < nums.length; x++) {
                    if ((nums[i] + nums[x]) == target) {
                        
                        ansIndex[1] = x;
                        return ansIndex;
                    }
                }
            
        }
        return ansIndex;
    }

}