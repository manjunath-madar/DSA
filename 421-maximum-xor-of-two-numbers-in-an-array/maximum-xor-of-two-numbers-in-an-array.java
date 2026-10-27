class Solution {
public int findMaximumXOR(int[] nums) {

    int max = 0;
    int mask = 0;

    for (int i = 31; i >= 0; i--) {

        mask |= (1 << i);

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            int prefix = num & mask;
            set.add(prefix);
        }

        int candidate = max | (1 << i);

        for (int prefix : set) {

            int required = prefix ^ candidate;

            if (set.contains(required)) {
                max = candidate;
                break;
            }
        }
    }

    return max;
}

}
