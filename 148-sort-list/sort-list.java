/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public static ListNode merge(ListNode left, ListNode right)
    {
        ListNode res=null;
        if(left==null)
        return right;
        if(right==null)
        return left;
        if(left.val<=right.val)
        {
            res=left;
            res.next=merge(left.next,right);
        }
        else{
            res=right;
            res.next=merge(left,right.next);
        }
        return res;
    }
   
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
        return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        
        prev.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        return merge(left,right);
    }
}