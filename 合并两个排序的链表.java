/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = null;
		ListNode temp = null;
		while(list1 != null && list2 != null){
			if(list1.val < list2.val){
				if(temp != null){
					temp.next = list1;
				}
				temp = list1;
				list1 = list1.next;
			}
			else{
				if(temp != null){
					temp.next = list2;
				}
				temp = list2;
				list2 = list2.next;
			}
			if(head == null){
				head = temp;
			}
		}
		while(list1 != null){
			if(temp != null){
				temp.next = list1;
			}
			temp = list1;
			list1 = list1.next;
			if(head == null){
				head = temp;
			}
		}
		while(list2 != null){
			if(temp != null){
				temp.next = list2;
			}
			temp = list2;
			list2 = list2.next;
			if(head == null){
				head = temp;
			}
		}
        return head;
    }
}