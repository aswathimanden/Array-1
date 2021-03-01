// Time Complexity : O(3n), asymptotically O(n), n = length of array
// Space Complexity : O(n), n = length of array
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        left[0] = 1;
        left[1] = nums[0];
        for(int i = 2; i < nums.length; i++){
            left[i] = left[i -1] * nums[i - 1];
        }
        right[nums.length - 1] = 1;
        right[nums.length - 2] = nums[nums.length - 1];
        for(int i = nums.length - 3; i >= 0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }
        // int[] out = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            left[i] = left[i] * right[i];
        }
        return left;
    }
}
