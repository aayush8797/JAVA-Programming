public class median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < n) {
            merged[k++] = nums1[i++];
        }
        while (j < m) {
            merged[k++] = nums2[j++];
        }

        if ((n + m) % 2 == 0) {
            return (merged[(n + m) / 2 - 1] + merged[(n + m) / 2]) / 2.0;
        } else {
            return merged[(n + m) / 2];
        }
    }
    public static void main(String[] args) {
        int s1[] = {1,3};
        int s2[] = {2,7};
        System.out.println(findMedianSortedArrays(s1, s2));
    }
}
