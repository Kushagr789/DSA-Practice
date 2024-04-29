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
        ListNode res=new ListNode(0),p=res;
        while(left!=null&&right!=null)
        {
            if(left.val<=right.val)
            {
                p.next=left;
                left=left.next;
            }
            else{
                p.next=right;
                right=right.next;
            }
            p=p.next;
        }
        if(left!=null)
        p.next=left;
        if(right!=null)
        p.next=right;
        
        return res.next;
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