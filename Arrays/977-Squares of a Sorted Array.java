class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        if(neg.size() == 0){
            for(int i=0;i<pos.size();i++){
                pos.set(i,pos.get(i)*pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }
        if(pos.size() == 0){
            for(int i=0;i<neg.size();i++){
                neg.set(i,neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }
        int[] res = new int[neg.size()+pos.size()];
        for(int i=0;i<neg.size();i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);
        for(int i=0;i<pos.size();i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }
        int i=0,j=0,id=0;
        while(i<pos.size() && j<neg.size()){
            if(pos.get(i) >= neg.get(j)){
                res[id]=neg.get(j);
                id++;
                j++;
            }
            else{
                res[id]=pos.get(i);
                id++;
                i++;
            }
        }
        while(i<pos.size()){
            res[id]=pos.get(i);
            id++;
            i++;
        }
        while(j<neg.size()){
            res[id]=neg.get(j);
            id++;
            j++;
        }
        return res;
    }
}