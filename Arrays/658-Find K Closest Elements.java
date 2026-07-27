class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) ->{
                int disA = Math.abs(a-x);
                int disB = Math.abs(b-x);
                if(disA != disB) return Integer.compare(disB,disA);
                return Integer.compare(b,a);
            }
        );
        for(int num : arr){
            pq.offer(num);
            if(pq.size() > k) pq.poll();

        }
        ArrayList<Integer> ans = new ArrayList<>(pq);
        Collections.sort(ans);
        return ans;
    }    
}