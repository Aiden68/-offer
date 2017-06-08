public class Solution {
    public boolean solve(int [] sequence, int s, int e){
		if(s >= e){
			return true;
		}
		int i = s;
		while(i < e && sequence[i] < sequence[e]){
			i++;
		}
		for(int j = i; j < e; j++){
			if(sequence[j] < sequence[e]){
				return false;
			}
		}
		return solve(sequence, s, i - 1) && solve(sequence, i, e - 1);
	}
	
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length == 0){
			return false;
		}
        return solve(sequence, 0, sequence.length - 1);
    }
}