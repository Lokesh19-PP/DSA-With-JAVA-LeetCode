class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int size = m+n;
        int[] nums3=new int[size];
        for(int i = size-1;i>=0;i--){
            if (m > 0 && (n == 0 || nums1[m-1] > nums2[n-1])) {
                nums3[i] = nums1[--m];
            } else {
                nums3[i] = nums2[--n];
            }
        }
        if(size%2 == 1){
            return nums3[size/2];
        }
        else{
            return (nums3[size/2-1]+nums3[size/2])/2.0;
        }

    }
}