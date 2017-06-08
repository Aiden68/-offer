import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
    	ArrayList<Integer> res = new ArrayList<>();
		int row = matrix.length;
		int column = matrix[0].length;
		int size = row * column;
		int ti = 0, tj = 0;
		while(res.size() < size){
			for(int j = tj; j < column - tj && res.size() < size; j++){
				res.add(matrix[ti][j]);
			}
			for(int i = ti + 1; i < row - ti && res.size() < size; i++){
				res.add(matrix[i][column - tj - 1]);
			}
			for(int j = column - tj - 2; j >= tj && res.size() < size; j--){
				res.add(matrix[row - ti - 1][j]);
			}
			for(int i = row - ti - 2; i > ti && res.size() < size; i--){
				res.add(matrix[i][tj]);
			}
			tj++;
			ti++;
		}
		return res; 
    }
}