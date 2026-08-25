class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        boolean visited[] = new boolean[arr.length];

        int frequencies[] = new int[arr.length];
        int index = 0;

        for(int i=0; i<arr.length; i++) {

            if(visited[i]) {
                continue;
            }
            int count = 0;
            for(int j=0; j<arr.length; j++) {

                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            frequencies[index] = count;
            index++;
            
        }

        for(int i=0; i<index; i++) {

            for(int j=i+1; j<index; j++) {

                if(frequencies[i] == frequencies[j]) {

                    return false;

                }
            }
        }

        return true;
        
    }
}
