class Solution {
    public int longestAwesome(String s) {

        int first[] = new int[1<<10];

        Arrays.fill(first, -2);

        first[0] = -1;

        int mask = 0;
        int ans = 0;

        for(int i=0; i<s.length(); i++) {

            int digit = s.charAt(i) - '0';

            mask = mask ^ (1 << digit);

            if(first[mask] != -2) {
                ans = Math.max(ans, i - first[mask]);
            }

            for(int j=0; j<10; j++) {

                int target = mask ^ (1 << j);

                if(first[target] != -2) {
                    ans = Math.max(ans, i - first[target]);
                }
            }

            if(first[mask] == -2) {
                first[mask] = i;
            }

        }

        return ans;
        
    }
}