class Solution {
    public int maxProductDifference(int[] nums) {
        
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;

        int c = Integer.MAX_VALUE;
        int d = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {

            // Two Largest Number

            if(nums[i] > a) {
                b = a;
                a = nums[i];
            }
            else if(nums[i] > b) {
                b = nums[i];
            }

            // Two Smallest Number

            if(nums[i] < c) {
                d = c;
                c = nums[i];
            }
            else if(nums[i] < d) {
                d = nums[i];
            }

        }

        return (a * b) - (c * d);
    }
}