//LeetCode 4
//Median of two sorted arrays
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double res =0.0d;
        int n = nums1.length;
        int m = nums2.length;
        int[] nums3 = new int[n + m];
        
        int i = 0; 
        int j = 0;
        int k = 0;
 
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        while (i < n) {
            nums3[k++] = nums1[i++];
        }
    
        while (j < m) {
            nums3[k++] = nums2[j++];
        }

        int o= nums3.length;
        if(o%2!=0)
        return (nums3[(o-1)/2]);
        else
        res= (((nums3[(o-1)/2])+(nums3[o/2]))/2.0);
        return res;
    }

}
