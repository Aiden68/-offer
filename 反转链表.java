/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = head, post = head.next;
        pre.next = null;
		while(post != null){
            pre = head;
       		head = post;
        	post = post.next;
            head.next = pre;
        }
        return head;
    }
}