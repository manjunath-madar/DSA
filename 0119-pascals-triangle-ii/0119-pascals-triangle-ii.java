class Solution {
    public List<Integer> getRow(int rowIndex) {

         ArrayList<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<=rowIndex; i++) {

            List<Integer> row = new ArrayList<>();

            for(int j=0; j<=i; j++) {

                if(j == 0 || j == i) {

                    row.add(1);

                }
                else {

                    int a = result.get(i-1).get(j-1);
                    int b = result.get(i-1).get(j);

                    row.add(a + b);
                }
            }

            result.add(row);

        }

        List<Integer> getrow = new ArrayList<>();

        getrow = result.get(rowIndex);

        return getrow;

        
    }
}