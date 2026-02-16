class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;

        if(n < 2) return 0;

        if(n == 2) return Math.max(nums[0],nums[1])-Math.min(nums[0],nums[1]);

        int min = nums[0];
        int max = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
    
        if(min == max) return 0;

        int bucketSize = Math.max(1,(max-min)/(n-1));
        int bucketCount = (max-min)/bucketSize+1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        boolean[] used = new boolean[bucketCount];

        Arrays.fill(bucketMin,Integer.MAX_VALUE);
        Arrays.fill(bucketMax,Integer.MIN_VALUE);

        for(int num : nums){
            int i = (num-min)/bucketSize;
            used[i] = true;
            bucketMin[i] = Math.min(bucketMin[i], num);
            bucketMax[i] = Math.max(bucketMax[i], num);
        }

        int gap = 0;
        int prev = min;
        for (int i = 0; i < bucketCount; i++){
            if(!used[i]) continue;
            gap = Math.max(gap, bucketMin[i] - prev);
            prev = bucketMax[i];
        }

        return gap;
    }
}