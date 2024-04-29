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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        int i=0;
        while(i<n)
        {
            fast=fast.next;
            i++;
        }
        if(fast==null)
        return head.next;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp=slow.next;
        slow.next=temp.next;
        temp=null;
        return head;
    }
}