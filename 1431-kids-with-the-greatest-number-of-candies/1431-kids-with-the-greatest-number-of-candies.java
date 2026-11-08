class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> list = new ArrayList<>();
        
        int maxofCad = 0;
        for(int candi : candies) {
            maxofCad = Math.max(candi, maxofCad);
        }

        for(int i=0; i<candies.length; i++) {

            int total = candies[i] + extraCandies;

            if(total >= maxofCad) {
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }    
}