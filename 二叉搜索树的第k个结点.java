/*
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
    int cnt = 1;
    int flag = 0;
    TreeNode ans = null;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null){
            return null;
        }
        inOrderTraversal(pRoot, k);
        return ans;
    }
	
    public void inOrderTraversal(TreeNode pRoot, int k){
        if(flag == 1){
            return;
        }
        if(pRoot.left != null){
            inOrderTraversal(pRoot.left, k);
        }
        if(cnt == k && flag == 0){
            ans = pRoot;
            flag = 1;
            return;
        }
        else{
            cnt++;
        }
        if(pRoot.right != null){
            inOrderTraversal(pRoot.right, k);
        }
    }

}