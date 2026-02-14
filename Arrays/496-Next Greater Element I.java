class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int temp = nums1[i];
            int nextGreater = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (temp == nums2[j]) {
                    for (int p = j + 1; p < nums2.length; p++) {
                        if (nums2[p] > temp) {
                            nextGreater = nums2[p];
                            break;
                        }
                    }
                    break;
                }
            }
            num[i] = nextGreater;
        }
        return num;   
    }
}