class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {

            String word = strs[i];

            char chars[] = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<List<String>>(map.values());
        
    }
}