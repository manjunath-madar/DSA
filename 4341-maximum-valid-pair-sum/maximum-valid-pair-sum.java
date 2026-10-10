class Solution {
    public int maxValidPairSum(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        int leftMax = Integer.MIN_VALUE;

        for(int i=k; i<nums.length; i++) {

            leftMax = Math.max(leftMax, nums[i-k]);

            int sum = leftMax + nums[i];

            max = Math.max(max, sum);
        }

        return max;
        
    }
}