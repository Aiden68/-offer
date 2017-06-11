/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead){
		if(pHead == null){
			return null;
		}
        RandomListNode curNode = pHead;
        while(curNode != null){        	
        	RandomListNode temp = new RandomListNode(curNode.label);
        	temp.next = curNode.next;
        	curNode.next = temp;
        	curNode = temp.next;
        }
        curNode = pHead;
        while(curNode != null){
        	RandomListNode temp = curNode.next;
        	if(curNode.random != null){        		
        		temp.random = curNode.random.next;
        	}
        	curNode = temp.next;
        }
        RandomListNode pCloneList = pHead.next;
        RandomListNode pcur = pHead;
        curNode = pCloneList;
        while(pcur != null){
        	pcur.next = pcur.next.next;
        	if(curNode.next != null){        		
        		curNode.next = curNode.next.next;
        	}
        	pcur = pcur.next;
        	curNode = curNode.next;
        }
		return pCloneList;
    }
}