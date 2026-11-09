class Solution {
    public List<Integer> circularPermutation(int n, int start) {

        ArrayList<Integer> list = new ArrayList<>();

        int size = 1 << n; // 4, 8

        for(int i=0; i<size; i++) {

            int gray = i ^ (i >> 1); 

            list.add(gray ^ start ^ (start ^ (start)));

        }

        return list;
        
    }
}