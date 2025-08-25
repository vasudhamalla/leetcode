class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> a = new PriorityQueue<>();
        a.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= a.peek()) {
                a.poll();
            }
            a.add(intervals[i][1]);
        }
        return a.size();
    }
}