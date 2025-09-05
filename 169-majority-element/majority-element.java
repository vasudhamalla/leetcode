class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int num : nums) {
            m1.put(num, m1.getOrDefault(num, 0) + 1);
            if (m1.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }
}