class Solution {
    public int countTriplets(int[] arr) {

        int count = 0;

        for(int i=0; i<arr.length; i++) {

            int x = 0;

            for(int j=i; j<arr.length; j++) {

                x = x ^ arr[j];

                if(x == 0) {

                    count += j - i;
                }
            }
        }

        return count;
        
    }
}