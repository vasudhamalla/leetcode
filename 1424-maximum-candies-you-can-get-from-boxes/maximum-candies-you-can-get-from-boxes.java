 class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int total = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] hasBox = new boolean[status.length];
        boolean[] visited = new boolean[status.length];
        
        for (int box : initialBoxes) {
            hasBox[box] = true;
            if (status[box] == 1) {
                queue.offer(box);
                visited[box] = true;
            }
        }
        
        while (!queue.isEmpty()) {
            int box = queue.poll();
            total += candies[box];
            
            // Process contained boxes
            for (int newBox : containedBoxes[box]) {
                hasBox[newBox] = true;
                if (status[newBox] == 1 && !visited[newBox]) {
                    queue.offer(newBox);
                    visited[newBox] = true;
                }
            }
            
            // Process keys
            for (int key : keys[box]) {
                if (status[key] == 0) {
                    status[key] = 1;
                    if (hasBox[key] && !visited[key]) {
                        queue.offer(key);
                        visited[key] = true;
                    }
                }
            }
        }
        
        return total;
    }
}
