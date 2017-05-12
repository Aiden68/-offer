class Solution {
public:
    bool isBalance = true;
    int getHeight(TreeNode* pRoot){
        if(pRoot == NULL)
            return 0;
        int left = getHeight(pRoot->left);
        int right = getHeight(pRoot->right);
        if(abs(left - right) > 1)
        	isBalance = false;
        return max(left, right) + 1;
    }
    bool IsBalanced_Solution(TreeNode* pRoot) {
		getHeight(pRoot);
        return isBalance;
    }
};