class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            maxHeap.offer(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(maxHeap.peek() > arr[i]){
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }
        return maxHeap.peek();
    }
}
