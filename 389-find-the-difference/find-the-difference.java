class Solution {
    public char findTheDifference(String s, String t) {

        char ans = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            ans = (char)(ans ^ ch);
        }
        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            ans = (char)(ans ^ ch);
        }

        return ans;
        
    }
}