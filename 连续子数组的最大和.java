public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
//		int s = 0, e = 0, ts = 0, te = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
			if(sum > max){
				max = sum;
			}
			if(sum < 0){
				sum = 0;
			}
		}
		return max;
    }
}