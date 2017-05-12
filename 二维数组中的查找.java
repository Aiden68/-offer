public class Solution {
    public boolean Find(int target, int [][] array) {
		int row = array.length;
        int column = array[0].length;
        int i = row - 1, j = 0;
        while(i >= 0 && j < column){
            if(target == array[i][j]){
                return true;
            }
            else if(target < array[i][j]){
                i--;
            }
            else{
                j++;
            }
        }
        return false;
    }
}