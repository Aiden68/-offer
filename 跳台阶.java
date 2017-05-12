public class Solution {
    public int JumpFloor(int target) {
		int[] temp = new int[2];
        if(target < 2){
			return 1;
        }
        temp[0] = 1;
        temp[1] = 1;
        int t = 0;
        for(int i = 1; i < target; i++){
            t = temp[0] + temp[1];
            temp[0] = temp[1];
            temp[1] = t;
        }
        return t;
    }
    
}