class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int MaxArea=0;
        while(left<right){
            int area=((right-left)*(height[left]>height[right]?height[right]:height[left]));
            MaxArea = Math.max(area,MaxArea);
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return MaxArea;
    }
}