class Solution {
    public int[] singleNumber(int[] nums) {

        int result = 0;

        for(int i=0; i<nums.length; i++) {
            result = result ^ nums[i];
        }

        int rightmostBit = result & (-result);

        int a = 0;
        int b = 0; 

        for(int i=0; i<nums.length; i++) {

            if((nums[i] & rightmostBit) != 0) {

                a = a ^ nums[i];

            }
            else {
                b = b ^ nums[i];
            }
        }

        return new int[]{a,b};
        
    }
}