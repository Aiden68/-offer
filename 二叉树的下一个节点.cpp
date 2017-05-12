/*
struct TreeLinkNode {
    int val;
    struct TreeLinkNode *left;
    struct TreeLinkNode *right;
    struct TreeLinkNode *next;
    TreeLinkNode(int x) :val(x), left(NULL), right(NULL), next(NULL) {
        
    }
};
*/
class Solution {
public:
    TreeLinkNode* GetNext(TreeLinkNode* pNode)
    {
        if(pNode == NULL)
            {
            return NULL;
        }
        TreeLinkNode* t = pNode;
        if(t->right != NULL)
            {
            t = t->right;
            while(t->left != NULL)
                {
                t = t->left;
            }
            return t;
        }
        while(t->next != NULL)
        {
        	if(t->next->left == t)
                {
                return t->next;
            }
            t = t->next;
        }
        return NULL;
    }
};