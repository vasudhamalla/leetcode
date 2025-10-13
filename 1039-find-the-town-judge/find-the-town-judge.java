class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) return 1;

        Map<Integer, Integer> c = new HashMap<>();
        Set<Integer> s = new HashSet<>();

        for (int[] t : trust) {
            s.add(t[0]);
            c.put(t[1], c.getOrDefault(t[1], 0) + 1);
        }

        for (int i = 1; i <= n; i++) {
            if (!s.contains(i) && c.getOrDefault(i, 0) == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
