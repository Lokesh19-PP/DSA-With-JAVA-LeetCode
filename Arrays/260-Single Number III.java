class Solution {
    public int[] singleNumber(int[] nums) {
        int temp = 0;
        for(int no : nums){
            temp = temp^no;
        }

        int mask = (temp & (-1*temp));
        int a = 0;
        for(int no : nums){
            if((mask & no) != 0){
                a = a ^ no;
            }
        }
        int b = temp ^ a;
        return new int[] {a,b};
    }
}