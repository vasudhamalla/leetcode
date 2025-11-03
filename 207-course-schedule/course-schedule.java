class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            int a = edge[0];
            int b = edge[1];
            adj.get(b).add(a);
        }
        List<Integer> a = topoSort(numCourses, adj);
        if(a.size() != 0) return true;
        else return false; 

    }

    public static List<Integer> topoSort(int n, List<List<Integer>> adj) {
        int[] indegree = new int[n];
        for (int u = 0; u < n; u++) {
            for (int v : adj.get(u))
                indegree[v]++;
        }

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++)
            if (indegree[i] == 0)
                q.add(i);

        List<Integer> order = new ArrayList<>();
        while (!q.isEmpty()) {
            int u = q.remove();
            order.add(u);
            for (int v : adj.get(u)) {
                indegree[v]--;
                if (indegree[v] == 0)
                    q.add(v);
            }
        }
        if (order.size() != n)
            return Collections.emptyList();
        return order;
    }
}