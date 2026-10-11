class Solution {
    public int findComplement(int num) {

        int bitMask = 1;

        while(bitMask < num) {

            bitMask = (bitMask << 1) | 1;

        }

        return (~num) & bitMask;
        
    }
}