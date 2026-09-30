class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int result[] = new int[n];

        int left = 0;
        int right = n - 1;

        for(int i=n-1; i>=0; i--) {

            int leftSqur = nums[left] * nums[left];
            int rightSqur = nums[right] * nums[right];

            if(leftSqur > rightSqur) {
                result[i] = leftSqur;
                left++;
            }
            else {
                result[i] = rightSqur;
                right--;
            }
        }

        return result;
         
    }
}