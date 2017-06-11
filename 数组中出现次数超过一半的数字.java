public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
		int cnt = 1;
		int ans = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] == ans){
				if(cnt < 2){
					cnt = 2;
				}
				else{
					cnt++;
				}
			}
			else{
				cnt--;
				if(cnt < 1){
					ans = array[i];
				}
			}
		}
		if(cnt < 1){
			return 0;
		}
		return ans;
    }
}