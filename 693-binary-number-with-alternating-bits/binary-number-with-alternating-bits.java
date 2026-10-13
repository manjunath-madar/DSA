class Solution {
    public boolean hasAlternatingBits(int n) {

        while(n > 0) {

            int lastBit = n & 1;
            n = n >> 1;

            int currBit = n & 1;

            if(lastBit == currBit) {
                return false;
            
            }
        }

       return true;   
    }
}