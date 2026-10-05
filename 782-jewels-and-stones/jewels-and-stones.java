class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int freq[] = new int[128];

        for(int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            freq[ch]++;
        }

        int count = 0;

        for(int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);

            if(freq[ch] > 0) {
                count++;
            }
        }

        return count;
    }
}