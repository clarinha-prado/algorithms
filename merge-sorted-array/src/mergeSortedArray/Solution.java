package mergeSortedArray;

import java.util.Arrays;

public class Solution {
	public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (n != 0) {
            for (int i = nums1.length-n; i<nums1.length; i++) {
            	nums1[i] = nums2[i-m];
            }
        }
        
        Arrays.sort(nums1);
        return nums1;
    }
}
