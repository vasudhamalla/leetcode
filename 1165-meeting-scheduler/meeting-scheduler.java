class Solution {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
         Arrays.sort(slots1, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(slots2, (a, b) -> Integer.compare(a[0], b[0]));
        List<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
          while (i < slots1.length && j < slots2.length) {
            int overlap_start = Math.max(slots1[i][0],slots2[j][0]);
            int overlap_end = Math.min(slots1[i][1],slots2[j][1]);
            if(overlap_end-overlap_start >= duration){
                list.add(overlap_start);
                list.add(overlap_start + duration);
                return list;
            }
            if (slots1[i][1] < slots2[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return list;

        }

    }