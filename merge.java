public class merge {
    public static void Merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1; 

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        for (int p = 0; p < m + n; p++) {
            System.out.print(nums1[p] + " ");
        }
    }
    public static void main(String[] args) {
        int num1[]= {1,7,9,14,0,0,0};
        int num2[] = {2,5,8,17};
        int m = num1.length;
        int n = num2.length;
        Merge(num1, m, num2, n);
    }
}
