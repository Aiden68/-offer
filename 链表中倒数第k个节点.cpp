/*
struct ListNode {
	int val;
	struct ListNode *next;
	ListNode(int x) :
			val(x), next(NULL) {
	}
};*/
class Solution {
public:
    ListNode* FindKthToTail(ListNode* pListHead, unsigned int k) {
        if(k <= 0)
            {
            return NULL;
        }
    	unsigned int cnt = 1;
        ListNode* temp = pListHead;
        int flag = 0;
        while(temp != NULL)
            {
            temp = temp->next;
            cnt++;
            if(cnt > k && temp != NULL)
                {
                pListHead = pListHead->next;
            }
        }
		if(cnt > k)
        {
            return pListHead;
        }
        else
        {
            return NULL;
        }
    }
};