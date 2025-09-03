class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            nums3[k++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            nums3[k++] = nums2[i];
        }
        Arrays.sort(nums3);
        double a = 0;
        if (nums3.length % 2 == 0) {
            int b = nums3.length / 2;
            a = (double) (nums3[b-1] + nums3[b]) / 2;
        } else {
            int b = nums3.length / 2;
            a = (double) nums3[b];
        }
        return a;
    }
}