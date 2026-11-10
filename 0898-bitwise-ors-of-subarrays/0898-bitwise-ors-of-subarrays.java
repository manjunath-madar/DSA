class Solution {
    public int subarrayBitwiseORs(int[] arr) {

        HashSet<Integer> resSet = new HashSet<>();
        HashSet<Integer> curr = new HashSet<>();

        for(int num : arr) {

            HashSet<Integer> updateSet = new HashSet<>();

            updateSet.add(num);

            for(int value : curr) {
                int bitCount = value | num;
                updateSet.add(bitCount);
            }

            curr = updateSet;

            resSet.addAll(curr);
        }

        return resSet.size();
        
    }
}