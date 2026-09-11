class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int ans = nums.length * 2;

        int prefix[] = new int[ans];

        for(int i=0; i<nums.length; i++) {

            prefix[i] = nums[i];

            prefix[i + nums.length] = nums[i];
        }

        return prefix;
    }
}