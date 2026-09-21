class Solution {
    public int findLucky(int[] arr) {

        int freq[] = new int[501];

        for(int i=0; i<arr.length; i++) {
            int num = arr[i];
            freq[num]++;
        }

        int ans = -1;

        for(int i=1; i<=500; i++) {

            if(freq[i] == i) {

                ans = i;

            }
        }

        return ans;
        
    }
}