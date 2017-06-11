import java.util.ArrayList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> dfs1(TreeNode root, int target, int val, ArrayList<Integer> temp,
			ArrayList<ArrayList<Integer>> res){
		val += root.val;
		temp.add(root.val);
		if(root.left == null && root.right == null){
			if(val == target){
				res.add(new ArrayList<>(temp));
			}
			return res;
		}
		if(root.left != null){
			res = dfs1(root.left, target, val, temp, res);
			temp.remove(temp.size() - 1);
		}
		if(root.right != null){
			res = dfs1(root.right, target, val, temp, res);
			temp.remove(temp.size() - 1);
		}
		return res;
	}
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		if(root == null){
			return res;
		}
		return dfs1(root, target, 0, temp, res);
    }
}