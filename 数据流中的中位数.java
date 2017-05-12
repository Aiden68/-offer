import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		};
	});
	
	public void Insert(Integer num) {
    	if(minHeap.size() > maxHeap.size()){
    		maxHeap.add(num);
    	}
    	else {
			minHeap.add(num);
		}
    	if(maxHeap.size() > 0 && minHeap.size() > 0){
    		if(minHeap.peek() < maxHeap.peek()){
    			int tmin = minHeap.poll();
    			int tmax = maxHeap.poll();
    			minHeap.add(tmax);
    			maxHeap.add(tmin);
    		}
    	}
    }

    public Double GetMedian() {
        if(minHeap.size() > maxHeap.size()){
        	return minHeap.peek() * 1.0;
        }
        else {
			return (maxHeap.peek() + minHeap.peek()) / 2.0;
		}
    }
    


}