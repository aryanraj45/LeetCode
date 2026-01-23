import java.util.Arrays;

class Solution {
    // Small change 2
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        // Merge two arrays
        int[] merged = new int[n + m];
        System.arraycopy(nums1, 0, merged, 0, n);
        System.arraycopy(nums2, 0, merged, n, m);
        
        Arrays.sort(merged);
        
        int len = merged.length;
        
        if (len % 2 == 0) {
            return (merged[len/2 - 1] + merged[len/2]) / 2.0;
        } 
        
        else {
            return merged[len/2];
        }
    }
}


