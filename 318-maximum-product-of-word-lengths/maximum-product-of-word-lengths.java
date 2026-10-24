class Solution {
    public int maxProduct(String[] words) {

        int masks[] = new int[words.length];

        for(int i=0; i<words.length; i++) {
            int mask = 0;

            for(int j=0; j<words[i].length(); j++) {

                int pos = words[i].charAt(j) - 'a';
                
                mask = mask | (1 << pos);
            }

            masks[i] = mask;
        }

        int max = 0;

        for(int i=0; i<words.length; i++) {

            for(int j=i+1; j<words.length; j++) {

                if((masks[i] & masks[j]) == 0) {
                    int product = words[i].length() * words[j].length();

                    max = Math.max(max, product);
                }
            }
        }

        return max;
        
    }
}